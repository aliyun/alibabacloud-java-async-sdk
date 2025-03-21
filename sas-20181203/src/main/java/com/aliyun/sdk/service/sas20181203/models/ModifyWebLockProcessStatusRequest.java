// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyWebLockProcessStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockProcessStatusRequest</p>
 */
public class ModifyWebLockProcessStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DealAll")
    private Integer dealAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateInfo")
    private String operateInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessPath")
    private java.util.List<String> processPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
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
    public java.util.List<String> getProcessPath() {
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
        private java.util.List<String> processPath; 
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
         * <p>Specifies whether to change the status of the process on multiple servers on which the process runs at the same time. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dealAll(Integer dealAll) {
            this.putQueryParameter("DealAll", dealAll);
            this.dealAll = dealAll;
            return this;
        }

        /**
         * <p>The parameters required to change the status of multiple processes at a time. The value is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;processPath&quot;:&quot;/etc/test1&quot;,&quot;uuid&quot;:&quot;0c1714dc-f7a3-4265-8364-7aa3fce8****&quot;},{&quot;processPath&quot;:&quot;/etc/test2&quot;,&quot;uuid&quot;:&quot;1cc45e7d-7698-4b2c-89d8-e8cba407****&quot;}]</p>
         */
        public Builder operateInfo(String operateInfo) {
            this.putQueryParameter("OperateInfo", operateInfo);
            this.operateInfo = operateInfo;
            return this;
        }

        /**
         * <p>The paths to the processes.</p>
         */
        public Builder processPath(java.util.List<String> processPath) {
            this.putQueryParameter("ProcessPath", processPath);
            this.processPath = processPath;
            return this;
        }

        /**
         * <p>The status of the process. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: cancels adding the process to the process whitelist</li>
         * <li><strong>1</strong>: adds the process to the process whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>bc8510e7-7327-4030-b75c-956e434d****</p>
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
