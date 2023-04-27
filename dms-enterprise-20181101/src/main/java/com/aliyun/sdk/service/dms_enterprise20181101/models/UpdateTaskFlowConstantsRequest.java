// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowConstantsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowConstantsRequest</p>
 */
public class UpdateTaskFlowConstantsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagConstants")
    private java.util.List < DagConstants> dagConstants;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
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
         * The key value of a constant for the task flow.
         */
        public Builder dagConstants(java.util.List < DagConstants> dagConstants) {
            String dagConstantsShrink = shrink(dagConstants, "DagConstants", "json");
            this.putQueryParameter("DagConstants", dagConstantsShrink);
            this.dagConstants = dagConstants;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The constants for the task flow.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The ID of the request. You can use the ID to locate logs and troubleshoot issues.
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
