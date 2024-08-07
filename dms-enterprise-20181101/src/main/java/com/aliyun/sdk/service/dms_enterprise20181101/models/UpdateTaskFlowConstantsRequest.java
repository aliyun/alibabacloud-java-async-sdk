// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowConstantsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowConstantsRequest</p>
 */
public class UpdateTaskFlowConstantsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagConstants")
    private java.util.List < DagConstants> dagConstants;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private UpdateTaskFlowConstantsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagConstants = builder.dagConstants;
        this.dagId = builder.dagId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskFlowConstantsRequest create() {
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
     * @return dagConstants
     */
    public java.util.List < DagConstants> getDagConstants() {
        return this.dagConstants;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateTaskFlowConstantsRequest, Builder> {
        private String regionId; 
        private java.util.List < DagConstants> dagConstants; 
        private Long dagId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskFlowConstantsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagConstants = request.dagConstants;
            this.dagId = request.dagId;
            this.tid = request.tid;
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
         * The constants for the task flow.
         */
        public Builder dagConstants(java.util.List < DagConstants> dagConstants) {
            String dagConstantsShrink = shrink(dagConstants, "DagConstants", "json");
            this.putQueryParameter("DagConstants", dagConstantsShrink);
            this.dagConstants = dagConstants;
            return this;
        }

        /**
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateTaskFlowConstantsRequest build() {
            return new UpdateTaskFlowConstantsRequest(this);
        } 

    } 

    public static class DagConstants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DagConstants(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagConstants create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key name of a constant for the task flow.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The key value of a constant for the task flow.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DagConstants build() {
                return new DagConstants(this);
            } 

        } 

    }
}
