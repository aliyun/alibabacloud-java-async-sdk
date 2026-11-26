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
 * {@link SearchContentRequest} extends {@link RequestModel}
 *
 * <p>SearchContentRequest</p>
 */
public class SearchContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Request")
    @com.aliyun.core.annotation.Validation(required = true)
    private SearchContentRequestRequest request;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private SearchContentRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.request = builder.request;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchContentRequest create() {
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
     * @return request
     */
    public SearchContentRequestRequest getRequest() {
        return this.request;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<SearchContentRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private SearchContentRequestRequest request; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(SearchContentRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.request = request.request;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device identification information</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>Request Parameters</p>
         * <p>This parameter is required.</p>
         */
        public Builder request(SearchContentRequestRequest request) {
            String requestShrink = shrink(request, "Request", "json");
            this.putBodyParameter("Request", requestShrink);
            this.request = request;
            return this;
        }

        /**
         * <p>User identification information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public SearchContentRequest build() {
            return new SearchContentRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchContentRequest} extends {@link TeaModel}
     *
     * <p>SearchContentRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>Value corresponding to the encoding type.  </p>
             * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application&quot;s Skill ID.<br>When the encoding type is <code>PACKAGE_NAME</code>, the value is the <code>packageName</code> of the corresponding client app.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.  </p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PACKAGE_NAME</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>Device ID, set to either <code>deviceOpenId</code> or <code>deviceUnionId</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DAFE****ce3ej=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of device ID.  </p>
             * <p><code>OPEN_ID</code>: Default device ID identity.<br><code>UNION_ID</code>: Organization-dimension device ID identity. This value is available only after an organization has been registered on the Tmall Genie Skill Application Open Platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID. Required when <code>IdType</code> is <code>UNION_ID</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
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
     * {@link SearchContentRequest} extends {@link TeaModel}
     *
     * <p>SearchContentRequest</p>
     */
    public static class SearchContentRequestRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cate")
        private String cate;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryAlbum")
        private Boolean queryAlbum;

        @com.aliyun.core.annotation.NameInMap("SubCate")
        private String subCate;

        private SearchContentRequestRequest(Builder builder) {
            this.cate = builder.cate;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.query = builder.query;
            this.queryAlbum = builder.queryAlbum;
            this.subCate = builder.subCate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchContentRequestRequest create() {
            return builder().build();
        }

        /**
         * @return cate
         */
        public String getCate() {
            return this.cate;
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

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryAlbum
         */
        public Boolean getQueryAlbum() {
            return this.queryAlbum;
        }

        /**
         * @return subCate
         */
        public String getSubCate() {
            return this.subCate;
        }

        public static final class Builder {
            private String cate; 
            private Integer pageNum; 
            private Integer pageSize; 
            private String query; 
            private Boolean queryAlbum; 
            private String subCate; 

            private Builder() {
            } 

            private Builder(SearchContentRequestRequest model) {
                this.cate = model.cate;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.query = model.query;
                this.queryAlbum = model.queryAlbum;
                this.subCate = model.subCate;
            } 

            /**
             * <p>The search scope: music or audio.<br>Input parameter enumeration: music | program</p>
             * 
             * <strong>example:</strong>
             * <p>music</p>
             */
            public Builder cate(String cate) {
                this.cate = cate;
                return this;
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
             * <p>Number of records per page</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Query keyword</p>
             * 
             * <strong>example:</strong>
             * <p>周杰伦</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>Whether to query albums</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder queryAlbum(Boolean queryAlbum) {
                this.queryAlbum = queryAlbum;
                return this;
            }

            /**
             * <p>When <code>cate</code> is <code>music</code>, <code>subCate</code> can be omitted.<br>If <code>subCate</code> is provided, it can be one of the following:<br><code>song</code> (Song), <code>singer</code> (Artist), <code>album</code> (Album).  </p>
             * <p>When <code>cate</code> is <code>program</code>, <code>subCate</code> can be omitted.<br>If <code>subCate</code> is provided, it can be one of the following:<br><code>album</code> (Album), <code>audio</code> (Program Audio), <code>radio</code> (Radio Station).</p>
             * 
             * <strong>example:</strong>
             * <p>singer</p>
             */
            public Builder subCate(String subCate) {
                this.subCate = subCate;
                return this;
            }

            public SearchContentRequestRequest build() {
                return new SearchContentRequestRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchContentRequest} extends {@link TeaModel}
     *
     * <p>SearchContentRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The value corresponding to the encoding type.</p>
             * <p>When the encoding type is SKILL_ID, the value is the Skill ID of the application.<br>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.  </p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PACKAGE_NAME</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>User identifier, set to either <code>userOpenId</code> or <code>userUnionId</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HOFF****my7Iw=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The Type of the User ID.</p>
             * <p>OPEN_ID: The default User ID identity.<br>UNION_ID: The organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie Skills Open Platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID. Required when <code>IdType</code> is <code>UNION_ID</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
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
