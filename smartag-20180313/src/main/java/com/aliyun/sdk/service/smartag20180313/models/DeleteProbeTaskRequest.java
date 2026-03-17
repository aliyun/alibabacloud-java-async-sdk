// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DeleteProbeTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteProbeTaskRequest</p>
 */
public class DeleteProbeTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String probeTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    private DeleteProbeTaskRequest(Builder builder) {
        super(builder);
        this.probeTaskId = builder.probeTaskId;
        this.regionId = builder.regionId;
        this.sagId = builder.sagId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProbeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return probeTaskId
     */
    public String getProbeTaskId() {
        return this.probeTaskId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sagId
     */
    public String getSagId() {
        return this.sagId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<DeleteProbeTaskRequest, Builder> {
        private String probeTaskId; 
        private String regionId; 
        private String sagId; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProbeTaskRequest request) {
            super(request);
            this.probeTaskId = request.probeTaskId;
            this.regionId = request.regionId;
            this.sagId = request.sagId;
            this.sn = request.sn;
        } 

        /**
         * <p>The ID of the probe task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>probe-****</p>
         */
        public Builder probeTaskId(String probeTaskId) {
            this.putQueryParameter("ProbeTaskId", probeTaskId);
            this.probeTaskId = probeTaskId;
            return this;
        }

        /**
         * <p>The region ID of the Smart Access Gateway (SAG) instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-****</p>
         */
        public Builder sagId(String sagId) {
            this.putQueryParameter("SagId", sagId);
            this.sagId = sagId;
            return this;
        }

        /**
         * <p>The serial number of the SAG device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag****</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public DeleteProbeTaskRequest build() {
            return new DeleteProbeTaskRequest(this);
        } 

    } 

}
