// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceMigrationAvailableNumbersRequest} extends {@link RequestModel}
 *
 * <p>ReplaceMigrationAvailableNumbersRequest</p>
 */
public class ReplaceMigrationAvailableNumbersRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OperatorName")
    private String operatorName;

    @Query
    @NameInMap("OperatorUid")
    private Long operatorUid;

    @Query
    @NameInMap("V1Numbers")
    private String v1Numbers;

    @Query
    @NameInMap("V2Numbers")
    private String v2Numbers;

    private ReplaceMigrationAvailableNumbersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operatorName = builder.operatorName;
        this.operatorUid = builder.operatorUid;
        this.v1Numbers = builder.v1Numbers;
        this.v2Numbers = builder.v2Numbers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceMigrationAvailableNumbersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operatorName
     */
    public String getOperatorName() {
        return this.operatorName;
    }

    /**
     * @return operatorUid
     */
    public Long getOperatorUid() {
        return this.operatorUid;
    }

    /**
     * @return v1Numbers
     */
    public String getV1Numbers() {
        return this.v1Numbers;
    }

    /**
     * @return v2Numbers
     */
    public String getV2Numbers() {
        return this.v2Numbers;
    }

    public static final class Builder extends Request.Builder<ReplaceMigrationAvailableNumbersRequest, Builder> {
        private String instanceId; 
        private String operatorName; 
        private Long operatorUid; 
        private String v1Numbers; 
        private String v2Numbers; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceMigrationAvailableNumbersRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operatorName = request.operatorName;
            this.operatorUid = request.operatorUid;
            this.v1Numbers = request.v1Numbers;
            this.v2Numbers = request.v2Numbers;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OperatorName.
         */
        public Builder operatorName(String operatorName) {
            this.putQueryParameter("OperatorName", operatorName);
            this.operatorName = operatorName;
            return this;
        }

        /**
         * OperatorUid.
         */
        public Builder operatorUid(Long operatorUid) {
            this.putQueryParameter("OperatorUid", operatorUid);
            this.operatorUid = operatorUid;
            return this;
        }

        /**
         * V1Numbers.
         */
        public Builder v1Numbers(String v1Numbers) {
            this.putQueryParameter("V1Numbers", v1Numbers);
            this.v1Numbers = v1Numbers;
            return this;
        }

        /**
         * V2Numbers.
         */
        public Builder v2Numbers(String v2Numbers) {
            this.putQueryParameter("V2Numbers", v2Numbers);
            this.v2Numbers = v2Numbers;
            return this;
        }

        @Override
        public ReplaceMigrationAvailableNumbersRequest build() {
            return new ReplaceMigrationAvailableNumbersRequest(this);
        } 

    } 

}
