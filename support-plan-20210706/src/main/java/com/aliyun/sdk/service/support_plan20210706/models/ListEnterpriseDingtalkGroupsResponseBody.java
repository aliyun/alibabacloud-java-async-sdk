// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

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
 * {@link ListEnterpriseDingtalkGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnterpriseDingtalkGroupsResponseBody</p>
 */
public class ListEnterpriseDingtalkGroupsResponseBody extends TeaModel {
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

    private ListEnterpriseDingtalkGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseDingtalkGroupsResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnterpriseDingtalkGroupsResponseBody build() {
            return new ListEnterpriseDingtalkGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnterpriseDingtalkGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseDingtalkGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("OpenGroupId")
        private String openGroupId;

        private Data(Builder builder) {
            this.groupName = builder.groupName;
            this.openGroupId = builder.openGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return openGroupId
         */
        public String getOpenGroupId() {
            return this.openGroupId;
        }

        public static final class Builder {
            private String groupName; 
            private String openGroupId; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * OpenGroupId.
             */
            public Builder openGroupId(String openGroupId) {
                this.openGroupId = openGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
