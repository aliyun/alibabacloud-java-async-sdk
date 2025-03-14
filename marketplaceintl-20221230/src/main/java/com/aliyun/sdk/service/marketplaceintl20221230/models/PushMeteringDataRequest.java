// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20221230.models;

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
 * {@link PushMeteringDataRequest} extends {@link RequestModel}
 *
 * <p>PushMeteringDataRequest</p>
 */
public class PushMeteringDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MeteringData")
    private java.util.List<MeteringData> meteringData;

    private PushMeteringDataRequest(Builder builder) {
        super(builder);
        this.gmtCreate = builder.gmtCreate;
        this.meteringData = builder.meteringData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMeteringDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return meteringData
     */
    public java.util.List<MeteringData> getMeteringData() {
        return this.meteringData;
    }

    public static final class Builder extends Request.Builder<PushMeteringDataRequest, Builder> {
        private String gmtCreate; 
        private java.util.List<MeteringData> meteringData; 

        private Builder() {
            super();
        } 

        private Builder(PushMeteringDataRequest request) {
            super(request);
            this.gmtCreate = request.gmtCreate;
            this.meteringData = request.meteringData;
        } 

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putBodyParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * MeteringData.
         */
        public Builder meteringData(java.util.List<MeteringData> meteringData) {
            this.putBodyParameter("MeteringData", meteringData);
            this.meteringData = meteringData;
            return this;
        }

        @Override
        public PushMeteringDataRequest build() {
            return new PushMeteringDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushMeteringDataRequest} extends {@link TeaModel}
     *
     * <p>PushMeteringDataRequest</p>
     */
    public static class MeteringData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MeteringAssist")
        private String meteringAssist;

        @com.aliyun.core.annotation.NameInMap("MeteringEntity")
        private String meteringEntity;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private MeteringData(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.meteringAssist = builder.meteringAssist;
            this.meteringEntity = builder.meteringEntity;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringData create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return meteringAssist
         */
        public String getMeteringAssist() {
            return this.meteringAssist;
        }

        /**
         * @return meteringEntity
         */
        public String getMeteringEntity() {
            return this.meteringEntity;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceId; 
            private String meteringAssist; 
            private String meteringEntity; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(MeteringData model) {
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.meteringAssist = model.meteringAssist;
                this.meteringEntity = model.meteringEntity;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MeteringAssist.
             */
            public Builder meteringAssist(String meteringAssist) {
                this.meteringAssist = meteringAssist;
                return this;
            }

            /**
             * MeteringEntity.
             */
            public Builder meteringEntity(String meteringEntity) {
                this.meteringEntity = meteringEntity;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public MeteringData build() {
                return new MeteringData(this);
            } 

        } 

    }
}
