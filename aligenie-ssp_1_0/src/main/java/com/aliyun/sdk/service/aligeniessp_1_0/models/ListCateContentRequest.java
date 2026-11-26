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
 * {@link ListCateContentRequest} extends {@link RequestModel}
 *
 * <p>ListCateContentRequest</p>
 */
public class ListCateContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Request")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListCateContentRequestRequest request;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private ListCateContentRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.request = builder.request;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCateContentRequest create() {
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
    public ListCateContentRequestRequest getRequest() {
        return this.request;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<ListCateContentRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private ListCateContentRequestRequest request; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListCateContentRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.request = request.request;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device identifier information</p>
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
        public Builder request(ListCateContentRequestRequest request) {
            String requestShrink = shrink(request, "Request", "json");
            this.putBodyParameter("Request", requestShrink);
            this.request = request;
            return this;
        }

        /**
         * <p>User identifier information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public ListCateContentRequest build() {
            return new ListCateContentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCateContentRequest} extends {@link TeaModel}
     *
     * <p>ListCateContentRequest</p>
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
             * <p>Value corresponding to the encoding type</p>
             * <p>When the encoding type is SKILL_ID, the value is the application&quot;s Skill ID.<br>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
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
             * <p>Encoding type. There are multiple ways to obtain the device identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p>PACKAGE_NAME: APK package name, used for the Android application customer link.
             * SKILL_ID: Skill ID, used for the cloud-based link.</p>
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
             * <p>Device identifier, set to deviceOpenId or deviceUnionId.</p>
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
             * <p>Type of device ID</p>
             * <p>OPEN_ID: Default device ID identifier.<br>UNION_ID: Organization-level device ID identifier. This value is available only after an organization has been registered on the Tmall Genie Skill Application Open Platform.</p>
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
             * <p>Organization ID. Required when IdType is UNION_ID.</p>
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
     * {@link ListCateContentRequest} extends {@link TeaModel}
     *
     * <p>ListCateContentRequest</p>
     */
    public static class ListCateContentRequestRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("IsAlbum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isAlbum;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("SortBy")
        private String sortBy;

        @com.aliyun.core.annotation.NameInMap("SortOrder")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sortOrder;

        private ListCateContentRequestRequest(Builder builder) {
            this.cateId = builder.cateId;
            this.isAlbum = builder.isAlbum;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.sortBy = builder.sortBy;
            this.sortOrder = builder.sortOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListCateContentRequestRequest create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return isAlbum
         */
        public Boolean getIsAlbum() {
            return this.isAlbum;
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
         * @return sortBy
         */
        public String getSortBy() {
            return this.sortBy;
        }

        /**
         * @return sortOrder
         */
        public String getSortOrder() {
            return this.sortOrder;
        }

        public static final class Builder {
            private Long cateId; 
            private Boolean isAlbum; 
            private Integer pageNum; 
            private Integer pageSize; 
            private String sortBy; 
            private String sortOrder; 

            private Builder() {
            } 

            private Builder(ListCateContentRequestRequest model) {
                this.cateId = model.cateId;
                this.isAlbum = model.isAlbum;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.sortBy = model.sortBy;
                this.sortOrder = model.sortOrder;
            } 

            /**
             * <p>Category ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80010</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>Indicates whether to query albums</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAlbum(Boolean isAlbum) {
                this.isAlbum = isAlbum;
                return this;
            }

            /**
             * <p>Page number</p>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Sorting field</p>
             * 
             * <strong>example:</strong>
             * <p>hot_score</p>
             */
            public Builder sortBy(String sortBy) {
                this.sortBy = sortBy;
                return this;
            }

            /**
             * <p>Sorting order</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DESC</p>
             */
            public Builder sortOrder(String sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            public ListCateContentRequestRequest build() {
                return new ListCateContentRequestRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCateContentRequest} extends {@link TeaModel}
     *
     * <p>ListCateContentRequest</p>
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
             * <p>Value corresponding to the encoding type.</p>
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
             * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p>PACKAGE_NAME: APK package name, used for the Android application customer link.<br>SKILL_ID: Skill ID, used for the cloud-based link.</p>
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
             * <p>User Identifier, set to userOpenId or userUnionId.</p>
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
             * <p>Type of User ID.</p>
             * <p>OPEN_ID: The default User ID identifier.<br>UNION_ID: The organization-dimension User ID identifier. This value is available only after an organization has been registered on the Tmall Genie Skills Application Open Platform.</p>
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
             * <p>Organization ID. Required when IdType is UNION_ID.</p>
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
