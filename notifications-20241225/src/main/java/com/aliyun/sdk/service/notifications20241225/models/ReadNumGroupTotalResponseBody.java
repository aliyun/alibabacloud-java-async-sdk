// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadNumGroupTotalResponseBody} extends {@link TeaModel}
 *
 * <p>ReadNumGroupTotalResponseBody</p>
 */
public class ReadNumGroupTotalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadNumGroupTotalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadNumGroupTotalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadNumGroupTotalResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned when the call fails. For more information, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The execution result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values: true and false. true: The call was successful. false: The call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReadNumGroupTotalResponseBody build() {
            return new ReadNumGroupTotalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadNumGroupTotalResponseBody} extends {@link TeaModel}
     *
     * <p>ReadNumGroupTotalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupCode")
        private String groupCode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ReadCount")
        private Long readCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UnReadCount")
        private Long unReadCount;

        private Data(Builder builder) {
            this.groupCode = builder.groupCode;
            this.id = builder.id;
            this.readCount = builder.readCount;
            this.totalCount = builder.totalCount;
            this.unReadCount = builder.unReadCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupCode
         */
        public String getGroupCode() {
            return this.groupCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return readCount
         */
        public Long getReadCount() {
            return this.readCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return unReadCount
         */
        public Long getUnReadCount() {
            return this.unReadCount;
        }

        public static final class Builder {
            private String groupCode; 
            private Long id; 
            private Long readCount; 
            private Long totalCount; 
            private Long unReadCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.groupCode = model.groupCode;
                this.id = model.id;
                this.readCount = model.readCount;
                this.totalCount = model.totalCount;
                this.unReadCount = model.unReadCount;
            } 

            /**
             * <p>The group code.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * <p>The message category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of read messages under the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * <p>The total number of messages under the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The number of unread messages under the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unReadCount(Long unReadCount) {
                this.unReadCount = unReadCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
