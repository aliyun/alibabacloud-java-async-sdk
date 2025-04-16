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
 * {@link FixDataRequest} extends {@link RequestModel}
 *
 * <p>FixDataRequest</p>
 */
public class FixDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FixDataCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private FixDataCommand fixDataCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private FixDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.fixDataCommand = builder.fixDataCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FixDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return fixDataCommand
     */
    public FixDataCommand getFixDataCommand() {
        return this.fixDataCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<FixDataRequest, Builder> {
        private String regionId; 
        private String env; 
        private FixDataCommand fixDataCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(FixDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
            this.fixDataCommand = request.fixDataCommand;
            this.opTenantId = request.opTenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fixDataCommand(FixDataCommand fixDataCommand) {
            String fixDataCommandShrink = shrink(fixDataCommand, "FixDataCommand", "json");
            this.putBodyParameter("FixDataCommand", fixDataCommandShrink);
            this.fixDataCommand = fixDataCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public FixDataRequest build() {
            return new FixDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link FixDataRequest} extends {@link TeaModel}
     *
     * <p>FixDataRequest</p>
     */
    public static class DownStreamInstanceIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceIdList")
        private java.util.List<String> fieldInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private DownStreamInstanceIdList(Builder builder) {
            this.fieldInstanceIdList = builder.fieldInstanceIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownStreamInstanceIdList create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceIdList
         */
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> fieldInstanceIdList; 
            private String id; 

            private Builder() {
            } 

            private Builder(DownStreamInstanceIdList model) {
                this.fieldInstanceIdList = model.fieldInstanceIdList;
                this.id = model.id;
            } 

            /**
             * FieldInstanceIdList.
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public DownStreamInstanceIdList build() {
                return new DownStreamInstanceIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FixDataRequest} extends {@link TeaModel}
     *
     * <p>FixDataRequest</p>
     */
    public static class RootInstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceIdList")
        private java.util.List<String> fieldInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private RootInstanceId(Builder builder) {
            this.fieldInstanceIdList = builder.fieldInstanceIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RootInstanceId create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceIdList
         */
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> fieldInstanceIdList; 
            private String id; 

            private Builder() {
            } 

            private Builder(RootInstanceId model) {
                this.fieldInstanceIdList = model.fieldInstanceIdList;
                this.id = model.id;
            } 

            /**
             * FieldInstanceIdList.
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_2323111</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public RootInstanceId build() {
                return new RootInstanceId(this);
            } 

        } 

    }
    /**
     * 
     * {@link FixDataRequest} extends {@link TeaModel}
     *
     * <p>FixDataRequest</p>
     */
    public static class FixDataCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainRootInstance")
        private Boolean containRootInstance;

        @com.aliyun.core.annotation.NameInMap("DownStreamInstanceIdList")
        private java.util.List<DownStreamInstanceIdList> downStreamInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("DownstreamRange")
        private String downstreamRange;

        @com.aliyun.core.annotation.NameInMap("ForceRerun")
        private Boolean forceRerun;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RootInstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private RootInstanceId rootInstanceId;

        private FixDataCommand(Builder builder) {
            this.containRootInstance = builder.containRootInstance;
            this.downStreamInstanceIdList = builder.downStreamInstanceIdList;
            this.downstreamRange = builder.downstreamRange;
            this.forceRerun = builder.forceRerun;
            this.projectId = builder.projectId;
            this.rootInstanceId = builder.rootInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixDataCommand create() {
            return builder().build();
        }

        /**
         * @return containRootInstance
         */
        public Boolean getContainRootInstance() {
            return this.containRootInstance;
        }

        /**
         * @return downStreamInstanceIdList
         */
        public java.util.List<DownStreamInstanceIdList> getDownStreamInstanceIdList() {
            return this.downStreamInstanceIdList;
        }

        /**
         * @return downstreamRange
         */
        public String getDownstreamRange() {
            return this.downstreamRange;
        }

        /**
         * @return forceRerun
         */
        public Boolean getForceRerun() {
            return this.forceRerun;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return rootInstanceId
         */
        public RootInstanceId getRootInstanceId() {
            return this.rootInstanceId;
        }

        public static final class Builder {
            private Boolean containRootInstance; 
            private java.util.List<DownStreamInstanceIdList> downStreamInstanceIdList; 
            private String downstreamRange; 
            private Boolean forceRerun; 
            private Long projectId; 
            private RootInstanceId rootInstanceId; 

            private Builder() {
            } 

            private Builder(FixDataCommand model) {
                this.containRootInstance = model.containRootInstance;
                this.downStreamInstanceIdList = model.downStreamInstanceIdList;
                this.downstreamRange = model.downstreamRange;
                this.forceRerun = model.forceRerun;
                this.projectId = model.projectId;
                this.rootInstanceId = model.rootInstanceId;
            } 

            /**
             * ContainRootInstance.
             */
            public Builder containRootInstance(Boolean containRootInstance) {
                this.containRootInstance = containRootInstance;
                return this;
            }

            /**
             * DownStreamInstanceIdList.
             */
            public Builder downStreamInstanceIdList(java.util.List<DownStreamInstanceIdList> downStreamInstanceIdList) {
                this.downStreamInstanceIdList = downStreamInstanceIdList;
                return this;
            }

            /**
             * DownstreamRange.
             */
            public Builder downstreamRange(String downstreamRange) {
                this.downstreamRange = downstreamRange;
                return this;
            }

            /**
             * ForceRerun.
             */
            public Builder forceRerun(Boolean forceRerun) {
                this.forceRerun = forceRerun;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>132344</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder rootInstanceId(RootInstanceId rootInstanceId) {
                this.rootInstanceId = rootInstanceId;
                return this;
            }

            public FixDataCommand build() {
                return new FixDataCommand(this);
            } 

        } 

    }
}
