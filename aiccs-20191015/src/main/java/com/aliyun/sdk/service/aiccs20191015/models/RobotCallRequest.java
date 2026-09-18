// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link RobotCallRequest} extends {@link RequestModel}
 *
 * <p>RobotCallRequest</p>
 */
public class RobotCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledShowNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledShowNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EarlyMediaAsr")
    private Boolean earlyMediaAsr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFlag")
    private Boolean recordFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long robotId;

    private RobotCallRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.earlyMediaAsr = builder.earlyMediaAsr;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.params = builder.params;
        this.recordFlag = builder.recordFlag;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.robotId = builder.robotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RobotCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return calledShowNumber
     */
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    /**
     * @return earlyMediaAsr
     */
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return recordFlag
     */
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return robotId
     */
    public Long getRobotId() {
        return this.robotId;
    }

    public static final class Builder extends Request.Builder<RobotCallRequest, Builder> {
        private String calledNumber; 
        private String calledShowNumber; 
        private Boolean earlyMediaAsr; 
        private String outId; 
        private Long ownerId; 
        private String params; 
        private Boolean recordFlag; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long robotId; 

        private Builder() {
            super();
        } 

        private Builder(RobotCallRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.earlyMediaAsr = request.earlyMediaAsr;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.params = request.params;
            this.recordFlag = request.recordFlag;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.robotId = request.robotId;
        } 

        /**
         * <p>The called number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131****2204</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The caller number for the outbound call. You can view this number on the <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> page of the voice messaging service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>132****0849</p>
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * <p>Specifies whether to enable the number status identification feature. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Disabled.</li>
         * <li><strong>true</strong>: Enabled.<blockquote>
         * <p>After this feature is enabled, the reason why a call is not answered is recorded.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
            return this;
        }

        /**
         * <p>The ID reserved for the caller. This ID is returned to the caller through a receipt message. The value is 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>222356****</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The parameter list of the robot in JSON format. The total length cannot exceed 512 bytes. You can view the parameters on the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> &gt; <strong>Details</strong> &gt; <strong>Input/Output Parameters</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2717999.html">ListRobotParams</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;name&quot;: &quot;Zhang San&quot;,
         *   &quot;age&quot;: &quot;25&quot;
         * }</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>Specifies whether to record the call. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Do not record.</li>
         * <li><strong>true</strong>: Record.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder recordFlag(Boolean recordFlag) {
            this.putQueryParameter("RecordFlag", recordFlag);
            this.recordFlag = recordFlag;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The robot ID, which is the script ID. You can view approved script IDs on the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000035******</p>
         */
        public Builder robotId(Long robotId) {
            this.putQueryParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        @Override
        public RobotCallRequest build() {
            return new RobotCallRequest(this);
        } 

    } 

}
