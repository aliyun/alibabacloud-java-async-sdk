// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProcessInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteProcessInstanceRequest</p>
 */
public class DeleteProcessInstanceRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ProcessInstanceId")
    @Validation(required = true)
    private Long processInstanceId;

    @Query
    @NameInMap("ProjectCode")
    @Validation(required = true)
    private Long projectCode;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteProcessInstanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.processInstanceId = builder.processInstanceId;
        this.projectCode = builder.projectCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProcessInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return processInstanceId
     */
    public Long getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return projectCode
     */
    public Long getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteProcessInstanceRequest, Builder> {
        private String DBClusterId; 
        private Long processInstanceId; 
        private Long projectCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProcessInstanceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.processInstanceId = request.processInstanceId;
            this.projectCode = request.projectCode;
            this.regionId = request.regionId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ProcessInstanceId.
         */
        public Builder processInstanceId(Long processInstanceId) {
            this.putQueryParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * ProjectCode.
         */
        public Builder projectCode(Long projectCode) {
            this.putQueryParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteProcessInstanceRequest build() {
            return new DeleteProcessInstanceRequest(this);
        } 

    } 

}
