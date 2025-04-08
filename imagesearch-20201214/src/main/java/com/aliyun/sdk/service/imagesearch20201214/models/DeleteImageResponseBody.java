// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link DeleteImageResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteImageResponseBody</p>
 */
public class DeleteImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteImageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteImageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned.</p>
         * <ul>
         * <li>A value of 0 indicates that the operation is successful.</li>
         * <li>Values other than 0 indicate errors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the deleted images.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0703956F-9BCC-48FA-99F7-96C0BF449C69</p>
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

        public DeleteImageResponseBody build() {
            return new DeleteImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteImageResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteImageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PicNames")
        private java.util.List<String> picNames;

        private Data(Builder builder) {
            this.picNames = builder.picNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return picNames
         */
        public java.util.List<String> getPicNames() {
            return this.picNames;
        }

        public static final class Builder {
            private java.util.List<String> picNames; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.picNames = model.picNames;
            } 

            /**
             * <p>The name (PicName) of the deleted image.</p>
             * 
             * <strong>example:</strong>
             * <p>5555.jpg</p>
             */
            public Builder picNames(java.util.List<String> picNames) {
                this.picNames = picNames;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
