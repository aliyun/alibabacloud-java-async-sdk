// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiRateConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiRateConfigListResponseBody</p>
 */
public class GetMultiRateConfigListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("GroupInfo")
    private GroupInfo groupInfo;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetMultiRateConfigListResponseBody(Builder builder) {
        this.code = builder.code;
        this.groupInfo = builder.groupInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiRateConfigListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return groupInfo
     */
    public GroupInfo getGroupInfo() {
        return this.groupInfo;
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

    public static final class Builder {
        private Integer code; 
        private GroupInfo groupInfo; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * GroupInfo.
         */
        public Builder groupInfo(GroupInfo groupInfo) {
            this.groupInfo = groupInfo;
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

        public GetMultiRateConfigListResponseBody build() {
            return new GetMultiRateConfigListResponseBody(this);
        } 

    } 

    public static class Info extends TeaModel {
        @NameInMap("App")
        private String app;

        @NameInMap("AvFormat")
        private String avFormat;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("GroupId")
        private String groupId;

        private Info(Builder builder) {
            this.app = builder.app;
            this.avFormat = builder.avFormat;
            this.count = builder.count;
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return avFormat
         */
        public String getAvFormat() {
            return this.avFormat;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private String app; 
            private String avFormat; 
            private Integer count; 
            private String groupId; 

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * AvFormat.
             */
            public Builder avFormat(String avFormat) {
                this.avFormat = avFormat;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    public static class GroupInfo extends TeaModel {
        @NameInMap("Info")
        private java.util.List < Info> info;

        private GroupInfo(Builder builder) {
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfo create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public java.util.List < Info> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private java.util.List < Info> info; 

            /**
             * Info.
             */
            public Builder info(java.util.List < Info> info) {
                this.info = info;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
}
