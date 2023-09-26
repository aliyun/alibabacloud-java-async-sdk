// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AkListPageResponseBody} extends {@link TeaModel}
 *
 * <p>AkListPageResponseBody</p>
 */
public class AkListPageResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    private AkListPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AkListPageResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AkListPageResponseBody build() {
            return new AkListPageResponseBody(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @NameInMap("authTime")
        private String authTime;

        @NameInMap("description")
        private String description;

        @NameInMap("group")
        private String group;

        @NameInMap("permissionCode")
        private String permissionCode;

        @NameInMap("permissionName")
        private String permissionName;

        private Permissions(Builder builder) {
            this.authTime = builder.authTime;
            this.description = builder.description;
            this.group = builder.group;
            this.permissionCode = builder.permissionCode;
            this.permissionName = builder.permissionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return authTime
         */
        public String getAuthTime() {
            return this.authTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return permissionCode
         */
        public String getPermissionCode() {
            return this.permissionCode;
        }

        /**
         * @return permissionName
         */
        public String getPermissionName() {
            return this.permissionName;
        }

        public static final class Builder {
            private String authTime; 
            private String description; 
            private String group; 
            private String permissionCode; 
            private String permissionName; 

            /**
             * authTime.
             */
            public Builder authTime(String authTime) {
                this.authTime = authTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * permissionCode.
             */
            public Builder permissionCode(String permissionCode) {
                this.permissionCode = permissionCode;
                return this;
            }

            /**
             * permissionName.
             */
            public Builder permissionName(String permissionName) {
                this.permissionName = permissionName;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("accessKeyId")
        private String accessKeyId;

        @NameInMap("accessKeyName")
        private String accessKeyName;

        @NameInMap("accessKeySecret")
        private String accessKeySecret;

        @NameInMap("active")
        private Integer active;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModify")
        private String gmtModify;

        @NameInMap("lastCallTime")
        private String lastCallTime;

        @NameInMap("permissions")
        private java.util.List < Permissions> permissions;

        private DataList(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeyName = builder.accessKeyName;
            this.accessKeySecret = builder.accessKeySecret;
            this.active = builder.active;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.lastCallTime = builder.lastCallTime;
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeyName
         */
        public String getAccessKeyName() {
            return this.accessKeyName;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return active
         */
        public Integer getActive() {
            return this.active;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return lastCallTime
         */
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        /**
         * @return permissions
         */
        public java.util.List < Permissions> getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeyName; 
            private String accessKeySecret; 
            private Integer active; 
            private String gmtCreate; 
            private String gmtModify; 
            private String lastCallTime; 
            private java.util.List < Permissions> permissions; 

            /**
             * accessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * accessKeyName.
             */
            public Builder accessKeyName(String accessKeyName) {
                this.accessKeyName = accessKeyName;
                return this;
            }

            /**
             * accessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * active.
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * lastCallTime.
             */
            public Builder lastCallTime(String lastCallTime) {
                this.lastCallTime = lastCallTime;
                return this;
            }

            /**
             * permissions.
             */
            public Builder permissions(java.util.List < Permissions> permissions) {
                this.permissions = permissions;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("count")
        private Integer count;

        @NameInMap("currentPage")
        private Integer currentPage;

        @NameInMap("dataList")
        private java.util.List < DataList> dataList;

        @NameInMap("totalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.dataList = builder.dataList;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return dataList
         */
        public java.util.List < DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private java.util.List < DataList> dataList; 
            private Integer totalPage; 

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * currentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * dataList.
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * totalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
