// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417.models;

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
 * {@link EngineSearchRequest} extends {@link RequestModel}
 *
 * <p>EngineSearchRequest</p>
 */
public class EngineSearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grey")
    private Boolean grey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private EngineSearchRequestQuery query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user")
    private User user;

    private EngineSearchRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.grey = builder.grey;
        this.query = builder.query;
        this.sessionId = builder.sessionId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EngineSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return grey
     */
    public Boolean getGrey() {
        return this.grey;
    }

    /**
     * @return query
     */
    public EngineSearchRequestQuery getQuery() {
        return this.query;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<EngineSearchRequest, Builder> {
        private String appId; 
        private Boolean grey; 
        private EngineSearchRequestQuery query; 
        private String sessionId; 
        private User user; 

        private Builder() {
            super();
        } 

        private Builder(EngineSearchRequest request) {
            super(request);
            this.appId = request.appId;
            this.grey = request.grey;
            this.query = request.query;
            this.sessionId = request.sessionId;
            this.user = request.user;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>507218</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * grey.
         */
        public Builder grey(Boolean grey) {
            this.putBodyParameter("grey", grey);
            this.grey = grey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(EngineSearchRequestQuery query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * user.
         */
        public Builder user(User user) {
            this.putBodyParameter("user", user);
            this.user = user;
            return this;
        }

        @Override
        public EngineSearchRequest build() {
            return new EngineSearchRequest(this);
        } 

    } 

    /**
     * 
     * {@link EngineSearchRequest} extends {@link TeaModel}
     *
     * <p>EngineSearchRequest</p>
     */
    public static class EngineSearchRequestQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("excludeIds")
        private java.util.List<String> excludeIds;

        @com.aliyun.core.annotation.NameInMap("imageUrls")
        private java.util.List<String> imageUrls;

        @com.aliyun.core.annotation.NameInMap("pageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("texts")
        private java.util.List<String> texts;

        private EngineSearchRequestQuery(Builder builder) {
            this.excludeIds = builder.excludeIds;
            this.imageUrls = builder.imageUrls;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.texts = builder.texts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineSearchRequestQuery create() {
            return builder().build();
        }

        /**
         * @return excludeIds
         */
        public java.util.List<String> getExcludeIds() {
            return this.excludeIds;
        }

        /**
         * @return imageUrls
         */
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return texts
         */
        public java.util.List<String> getTexts() {
            return this.texts;
        }

        public static final class Builder {
            private java.util.List<String> excludeIds; 
            private java.util.List<String> imageUrls; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> texts; 

            private Builder() {
            } 

            private Builder(EngineSearchRequestQuery model) {
                this.excludeIds = model.excludeIds;
                this.imageUrls = model.imageUrls;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.texts = model.texts;
            } 

            /**
             * excludeIds.
             */
            public Builder excludeIds(java.util.List<String> excludeIds) {
                this.excludeIds = excludeIds;
                return this;
            }

            /**
             * imageUrls.
             */
            public Builder imageUrls(java.util.List<String> imageUrls) {
                this.imageUrls = imageUrls;
                return this;
            }

            /**
             * pageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * texts.
             */
            public Builder texts(java.util.List<String> texts) {
                this.texts = texts;
                return this;
            }

            public EngineSearchRequestQuery build() {
                return new EngineSearchRequestQuery(this);
            } 

        } 

    }
    /**
     * 
     * {@link EngineSearchRequest} extends {@link TeaModel}
     *
     * <p>EngineSearchRequest</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private User(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            private Builder() {
            } 

            private Builder(User model) {
                this.userId = model.userId;
            } 

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
