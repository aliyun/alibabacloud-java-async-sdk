// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListDagsRequest} extends {@link RequestModel}
 *
 * <p>ListDagsRequest</p>
 */
public class ListDagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpSeq")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 2)
    private Long opSeq;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    private ListDagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opSeq = builder.opSeq;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDagsRequest create() {
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
     * @return opSeq
     */
    public Long getOpSeq() {
        return this.opSeq;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public static final class Builder extends Request.Builder<ListDagsRequest, Builder> {
        private String regionId; 
        private Long opSeq; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(ListDagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opSeq = request.opSeq;
            this.projectEnv = request.projectEnv;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The sequence number that uniquely identifies the data backfill operation. You can call the <a href="https://help.aliyun.com/document_detail/189753.html">GetDag</a> operation to query the sequence number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder opSeq(Long opSeq) {
            this.putBodyParameter("OpSeq", opSeq);
            this.opSeq = opSeq;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public ListDagsRequest build() {
            return new ListDagsRequest(this);
        } 

    } 

}
