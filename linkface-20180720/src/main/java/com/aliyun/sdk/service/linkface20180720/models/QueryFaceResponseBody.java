// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link QueryFaceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceResponseBody</p>
 */
public class QueryFaceResponseBody extends TeaModel {
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

    private QueryFaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public QueryFaceResponseBody build() {
            return new QueryFaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceResponseBody</p>
     */
    public static class UserFaceMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientTag")
        private String clientTag;

        @com.aliyun.core.annotation.NameInMap("FaceUrl")
        private String faceUrl;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private String userInfo;

        private UserFaceMetas(Builder builder) {
            this.clientTag = builder.clientTag;
            this.faceUrl = builder.faceUrl;
            this.index = builder.index;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserFaceMetas create() {
            return builder().build();
        }

        /**
         * @return clientTag
         */
        public String getClientTag() {
            return this.clientTag;
        }

        /**
         * @return faceUrl
         */
        public String getFaceUrl() {
            return this.faceUrl;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return userInfo
         */
        public String getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String clientTag; 
            private String faceUrl; 
            private Integer index; 
            private String userInfo; 

            /**
             * ClientTag.
             */
            public Builder clientTag(String clientTag) {
                this.clientTag = clientTag;
                return this;
            }

            /**
             * FaceUrl.
             */
            public Builder faceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(String userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public UserFaceMetas build() {
                return new UserFaceMetas(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFaceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIds")
        private java.util.List<String> groupIds;

        @com.aliyun.core.annotation.NameInMap("UserFaceMetas")
        private java.util.List<UserFaceMetas> userFaceMetas;

        private Data(Builder builder) {
            this.groupIds = builder.groupIds;
            this.userFaceMetas = builder.userFaceMetas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupIds
         */
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        /**
         * @return userFaceMetas
         */
        public java.util.List<UserFaceMetas> getUserFaceMetas() {
            return this.userFaceMetas;
        }

        public static final class Builder {
            private java.util.List<String> groupIds; 
            private java.util.List<UserFaceMetas> userFaceMetas; 

            /**
             * GroupIds.
             */
            public Builder groupIds(java.util.List<String> groupIds) {
                this.groupIds = groupIds;
                return this;
            }

            /**
             * UserFaceMetas.
             */
            public Builder userFaceMetas(java.util.List<UserFaceMetas> userFaceMetas) {
                this.userFaceMetas = userFaceMetas;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
