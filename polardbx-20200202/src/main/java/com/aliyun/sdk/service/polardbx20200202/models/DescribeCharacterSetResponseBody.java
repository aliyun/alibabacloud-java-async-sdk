// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCharacterSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCharacterSetResponseBody</p>
 */
public class DescribeCharacterSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCharacterSetResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCharacterSetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCharacterSetResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. &quot;success&quot; is returned if the request is successful. Otherwise, an error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>709C1E40-092D-4A3D-9958-6D7438******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCharacterSetResponseBody build() {
            return new DescribeCharacterSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCharacterSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCharacterSetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharacterSet")
        private java.util.List<String> characterSet;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        private Data(Builder builder) {
            this.characterSet = builder.characterSet;
            this.engine = builder.engine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return characterSet
         */
        public java.util.List<String> getCharacterSet() {
            return this.characterSet;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        public static final class Builder {
            private java.util.List<String> characterSet; 
            private String engine; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.characterSet = model.characterSet;
                this.engine = model.engine;
            } 

            /**
             * <p>The character sets supported by the instance. Valid values:</p>
             * <ul>
             * <li>utf8mb4</li>
             * <li>gbk</li>
             * <li>latin1</li>
             * <li>utf8</li>
             * </ul>
             */
            public Builder characterSet(java.util.List<String> characterSet) {
                this.characterSet = characterSet;
                return this;
            }

            /**
             * <p>The storage type of databases in the target instance. Currently, only polarx is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
