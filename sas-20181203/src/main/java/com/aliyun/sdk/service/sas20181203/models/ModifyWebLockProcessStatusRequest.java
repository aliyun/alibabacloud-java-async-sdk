// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockProcessStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockProcessStatusRequest</p>
 */
public class ModifyWebLockProcessStatusRequest extends Request {
    @Query
    @NameInMap("DealAll")
    private Integer dealAll;

    @Query
    @NameInMap("OperateInfo")
    private String operateInfo;

    @Query
    @NameInMap("ProcessPath")
    private java.util.List < String > processPath;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private ModifyWebLockProcessStatusRequest(Builder builder) {
        super(builder);
        this.dealAll = builder.dealAll;
        this.operateInfo = builder.operateInfo;
        this.processPath = builder.processPath;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockProcessStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dealAll
     */
    public Integer getDealAll() {
        return this.dealAll;
    }

    /**
     * @return operateInfo
     */
    public String getOperateInfo() {
        return this.operateInfo;
    }

    /**
     * @return processPath
     */
    public java.util.List < String > getProcessPath() {
        return this.processPath;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyWebLockProcessStatusRequest, Builder> {
        private Integer dealAll; 
        private String operateInfo; 
        private java.util.List < String > processPath; 
        private Integer status; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockProcessStatusRequest request) {
            super(request);
            this.dealAll = request.dealAll;
            this.operateInfo = request.operateInfo;
            this.processPath = request.processPath;
            this.status = request.status;
            this.uuid = request.uuid;
        } 

        /**
         * Specifies whether to change the status of the process on multiple servers on which the process runs at the same time. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder dealAll(Integer dealAll) {
            this.putQueryParameter("DealAll", dealAll);
            this.dealAll = dealAll;
            return this;
        }

        /**
         * The parameters required to change the status of multiple processes at a time. The value is in the JSON format.
         */
        public Builder operateInfo(String operateInfo) {
            this.putQueryParameter("OperateInfo", operateInfo);
            this.operateInfo = operateInfo;
            return this;
        }

        /**
         * The paths to the processes.
         */
        public Builder processPath(java.util.List < String > processPath) {
            this.putQueryParameter("ProcessPath", processPath);
            this.processPath = processPath;
            return this;
        }

        /**
         * The status of the process. Valid values:
         * <p>
         * 
         * *   **0**: cancels adding the process to the process whitelist
         * *   **1**: adds the process to the process whitelist
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The UUID of the server.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockProcessStatusRequest build() {
            return new ModifyWebLockProcessStatusRequest(this);
        } 

    } 

}
