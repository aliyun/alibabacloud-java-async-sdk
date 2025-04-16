// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcePermissionsResponseBody</p>
 */
public class ListResourcePermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListResourcePermissionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcePermissionsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListResourcePermissionsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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

        public ListResourcePermissionsResponseBody build() {
            return new ListResourcePermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class Period extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Period(Builder builder) {
            this.endTime = builder.endTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Period create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(Period model) {
                this.endTime = model.endTime;
                this.type = model.type;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Period build() {
                return new Period(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class PermissionPeriodListPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PermissionPeriodListPeriod(Builder builder) {
            this.endTime = builder.endTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionPeriodListPeriod create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(PermissionPeriodListPeriod model) {
                this.endTime = model.endTime;
                this.type = model.type;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PermissionPeriodListPeriod build() {
                return new PermissionPeriodListPeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class PermissionPeriodList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Period")
        private PermissionPeriodListPeriod period;

        @com.aliyun.core.annotation.NameInMap("PermissionType")
        private String permissionType;

        private PermissionPeriodList(Builder builder) {
            this.period = builder.period;
            this.permissionType = builder.permissionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionPeriodList create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public PermissionPeriodListPeriod getPeriod() {
            return this.period;
        }

        /**
         * @return permissionType
         */
        public String getPermissionType() {
            return this.permissionType;
        }

        public static final class Builder {
            private PermissionPeriodListPeriod period; 
            private String permissionType; 

            private Builder() {
            } 

            private Builder(PermissionPeriodList model) {
                this.period = model.period;
                this.permissionType = model.permissionType;
            } 

            /**
             * Period.
             */
            public Builder period(PermissionPeriodListPeriod period) {
                this.period = period;
                return this;
            }

            /**
             * PermissionType.
             */
            public Builder permissionType(String permissionType) {
                this.permissionType = permissionType;
                return this;
            }

            public PermissionPeriodList build() {
                return new PermissionPeriodList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class BizUnitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BizUnitInfo(Builder builder) {
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizUnitInfo create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String displayName; 
            private String env; 
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(BizUnitInfo model) {
                this.displayName = model.displayName;
                this.env = model.env;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>121323</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BizUnitInfo build() {
                return new BizUnitInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class ProjectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ProjectInfo(Builder builder) {
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectInfo create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String displayName; 
            private String env; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ProjectInfo model) {
                this.displayName = model.displayName;
                this.env = model.env;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>121323</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ProjectInfo build() {
                return new ProjectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class ResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitInfo")
        private BizUnitInfo bizUnitInfo;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectInfo")
        private ProjectInfo projectInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ResourceInfo(Builder builder) {
            this.bizUnitInfo = builder.bizUnitInfo;
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.id = builder.id;
            this.name = builder.name;
            this.projectInfo = builder.projectInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfo create() {
            return builder().build();
        }

        /**
         * @return bizUnitInfo
         */
        public BizUnitInfo getBizUnitInfo() {
            return this.bizUnitInfo;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectInfo
         */
        public ProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private BizUnitInfo bizUnitInfo; 
            private String displayName; 
            private String env; 
            private String id; 
            private String name; 
            private ProjectInfo projectInfo; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResourceInfo model) {
                this.bizUnitInfo = model.bizUnitInfo;
                this.displayName = model.displayName;
                this.env = model.env;
                this.id = model.id;
                this.name = model.name;
                this.projectInfo = model.projectInfo;
                this.type = model.type;
            } 

            /**
             * BizUnitInfo.
             */
            public Builder bizUnitInfo(BizUnitInfo bizUnitInfo) {
                this.bizUnitInfo = bizUnitInfo;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>121323</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjectInfo.
             */
            public Builder projectInfo(ProjectInfo projectInfo) {
                this.projectInfo = projectInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResourceInfo build() {
                return new ResourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class TargetAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TargetAccount(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetAccount create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(TargetAccount model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>121323</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetAccount build() {
                return new TargetAccount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthScope")
        private String authScope;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Period period;

        @com.aliyun.core.annotation.NameInMap("PermissionPeriodList")
        private java.util.List<PermissionPeriodList> permissionPeriodList;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("ResourceInfo")
        private ResourceInfo resourceInfo;

        @com.aliyun.core.annotation.NameInMap("TargetAccount")
        private TargetAccount targetAccount;

        private Data(Builder builder) {
            this.authScope = builder.authScope;
            this.period = builder.period;
            this.permissionPeriodList = builder.permissionPeriodList;
            this.recordId = builder.recordId;
            this.resourceInfo = builder.resourceInfo;
            this.targetAccount = builder.targetAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authScope
         */
        public String getAuthScope() {
            return this.authScope;
        }

        /**
         * @return period
         */
        public Period getPeriod() {
            return this.period;
        }

        /**
         * @return permissionPeriodList
         */
        public java.util.List<PermissionPeriodList> getPermissionPeriodList() {
            return this.permissionPeriodList;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return resourceInfo
         */
        public ResourceInfo getResourceInfo() {
            return this.resourceInfo;
        }

        /**
         * @return targetAccount
         */
        public TargetAccount getTargetAccount() {
            return this.targetAccount;
        }

        public static final class Builder {
            private String authScope; 
            private Period period; 
            private java.util.List<PermissionPeriodList> permissionPeriodList; 
            private String recordId; 
            private ResourceInfo resourceInfo; 
            private TargetAccount targetAccount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authScope = model.authScope;
                this.period = model.period;
                this.permissionPeriodList = model.permissionPeriodList;
                this.recordId = model.recordId;
                this.resourceInfo = model.resourceInfo;
                this.targetAccount = model.targetAccount;
            } 

            /**
             * AuthScope.
             */
            public Builder authScope(String authScope) {
                this.authScope = authScope;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * PermissionPeriodList.
             */
            public Builder permissionPeriodList(java.util.List<PermissionPeriodList> permissionPeriodList) {
                this.permissionPeriodList = permissionPeriodList;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * ResourceInfo.
             */
            public Builder resourceInfo(ResourceInfo resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            /**
             * TargetAccount.
             */
            public Builder targetAccount(TargetAccount targetAccount) {
                this.targetAccount = targetAccount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcePermissionsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
