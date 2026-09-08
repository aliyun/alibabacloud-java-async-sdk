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
 * {@link ReadNumGroupByClassResponseBody} extends {@link TeaModel}
 *
 * <p>ReadNumGroupByClassResponseBody</p>
 */
public class ReadNumGroupByClassResponseBody extends TeaModel {
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

    private ReadNumGroupByClassResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadNumGroupByClassResponseBody create() {
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

        private Builder(ReadNumGroupByClassResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned when the call fails. For more information, see error codes.</p>
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
         * <p>The message returned when the call fails.</p>
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
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReadNumGroupByClassResponseBody build() {
            return new ReadNumGroupByClassResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadNumGroupByClassResponseBody} extends {@link TeaModel}
     *
     * <p>ReadNumGroupByClassResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassId")
        private Long classId;

        @com.aliyun.core.annotation.NameInMap("MsgCount")
        private Long msgCount;

        private Data(Builder builder) {
            this.classId = builder.classId;
            this.msgCount = builder.msgCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return classId
         */
        public Long getClassId() {
            return this.classId;
        }

        /**
         * @return msgCount
         */
        public Long getMsgCount() {
            return this.msgCount;
        }

        public static final class Builder {
            private Long classId; 
            private Long msgCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.classId = model.classId;
                this.msgCount = model.msgCount;
            } 

            /**
             * <p>The message category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder classId(Long classId) {
                this.classId = classId;
                return this;
            }

            /**
             * <p>The number of unread messages in the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder msgCount(Long msgCount) {
                this.msgCount = msgCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
