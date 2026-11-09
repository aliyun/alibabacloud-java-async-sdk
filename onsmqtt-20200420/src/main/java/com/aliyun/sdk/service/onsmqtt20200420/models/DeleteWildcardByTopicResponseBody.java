// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link DeleteWildcardByTopicResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWildcardByTopicResponseBody</p>
 */
public class DeleteWildcardByTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteWildcardByTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWildcardByTopicResponseBody create() {
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
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteWildcardByTopicResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>200: success.</li>
         * <li>Other values: error codes. For more information, see error codes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The rule information dataset.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82B9E503-F4A1-4F30-976F-C6999FF9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li>true: The operation was successful.</li>
         * <li>false: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteWildcardByTopicResponseBody build() {
            return new DeleteWildcardByTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteWildcardByTopicResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteWildcardByTopicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Deleted")
        private String deleted;

        private Data(Builder builder) {
            this.deleted = builder.deleted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deleted
         */
        public String getDeleted() {
            return this.deleted;
        }

        public static final class Builder {
            private String deleted; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deleted = model.deleted;
            } 

            /**
             * <p>Indicates whether the deletion was successful. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The deletion was successful.</li>
             * <li><strong>false</strong>: The deletion failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder deleted(String deleted) {
                this.deleted = deleted;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
