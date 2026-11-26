// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListSubAlbumRequest} extends {@link RequestModel}
 *
 * <p>ListSubAlbumRequest</p>
 */
public class ListSubAlbumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuerySubscriptionAlbumRequest")
    private QuerySubscriptionAlbumRequest querySubscriptionAlbumRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private ListSubAlbumRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.querySubscriptionAlbumRequest = builder.querySubscriptionAlbumRequest;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubAlbumRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return querySubscriptionAlbumRequest
     */
    public QuerySubscriptionAlbumRequest getQuerySubscriptionAlbumRequest() {
        return this.querySubscriptionAlbumRequest;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<ListSubAlbumRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private QuerySubscriptionAlbumRequest querySubscriptionAlbumRequest; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListSubAlbumRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.querySubscriptionAlbumRequest = request.querySubscriptionAlbumRequest;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device Information</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>request</p>
         */
        public Builder querySubscriptionAlbumRequest(QuerySubscriptionAlbumRequest querySubscriptionAlbumRequest) {
            String querySubscriptionAlbumRequestShrink = shrink(querySubscriptionAlbumRequest, "QuerySubscriptionAlbumRequest", "json");
            this.putQueryParameter("QuerySubscriptionAlbumRequest", querySubscriptionAlbumRequestShrink);
            this.querySubscriptionAlbumRequest = querySubscriptionAlbumRequest;
            return this;
        }

        /**
         * <p>User information</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public ListSubAlbumRequest build() {
            return new ListSubAlbumRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSubAlbumRequest} extends {@link TeaModel}
     *
     * <p>ListSubAlbumRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private DeviceInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(DeviceInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubAlbumRequest} extends {@link TeaModel}
     *
     * <p>ListSubAlbumRequest</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        private Page(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private Integer pageNum; 
            private Integer pageSize; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
            } 

            /**
             * <p>Page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Number of entries per page</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubAlbumRequest} extends {@link TeaModel}
     *
     * <p>ListSubAlbumRequest</p>
     */
    public static class QuerySubscriptionAlbumRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbumId")
        private String albumId;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Page page;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private QuerySubscriptionAlbumRequest(Builder builder) {
            this.albumId = builder.albumId;
            this.categoryId = builder.categoryId;
            this.page = builder.page;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuerySubscriptionAlbumRequest create() {
            return builder().build();
        }

        /**
         * @return albumId
         */
        public String getAlbumId() {
            return this.albumId;
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return page
         */
        public Page getPage() {
            return this.page;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String albumId; 
            private Integer categoryId; 
            private Page page; 
            private String title; 

            private Builder() {
            } 

            private Builder(QuerySubscriptionAlbumRequest model) {
                this.albumId = model.albumId;
                this.categoryId = model.categoryId;
                this.page = model.page;
                this.title = model.title;
            } 

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>4476001</p>
             */
            public Builder albumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            /**
             * <p>Category ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80011</p>
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>Pagination Parameters</p>
             * <p>This parameter is required.</p>
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * <p>Album title</p>
             * 
             * <strong>example:</strong>
             * <p>睡前故事</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public QuerySubscriptionAlbumRequest build() {
                return new QuerySubscriptionAlbumRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubAlbumRequest} extends {@link TeaModel}
     *
     * <p>ListSubAlbumRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private UserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
