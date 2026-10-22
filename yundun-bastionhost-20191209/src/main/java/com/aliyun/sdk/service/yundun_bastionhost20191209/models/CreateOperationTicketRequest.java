// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateOperationTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateOperationTicketRequest</p>
 */
public class CreateOperationTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApproveComment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approveComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetAccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectEndTime")
    private Long effectEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectStartTime")
    private Long effectStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOneTimeEffect")
    private Boolean isOneTimeEffect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateOperationTicketRequest(Builder builder) {
        super(builder);
        this.approveComment = builder.approveComment;
        this.assetAccountName = builder.assetAccountName;
        this.assetId = builder.assetId;
        this.effectEndTime = builder.effectEndTime;
        this.effectStartTime = builder.effectStartTime;
        this.instanceId = builder.instanceId;
        this.isOneTimeEffect = builder.isOneTimeEffect;
        this.projectId = builder.projectId;
        this.protocolName = builder.protocolName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOperationTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approveComment
     */
    public String getApproveComment() {
        return this.approveComment;
    }

    /**
     * @return assetAccountName
     */
    public String getAssetAccountName() {
        return this.assetAccountName;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return effectEndTime
     */
    public Long getEffectEndTime() {
        return this.effectEndTime;
    }

    /**
     * @return effectStartTime
     */
    public Long getEffectStartTime() {
        return this.effectStartTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isOneTimeEffect
     */
    public Boolean getIsOneTimeEffect() {
        return this.isOneTimeEffect;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return protocolName
     */
    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOperationTicketRequest, Builder> {
        private String approveComment; 
        private String assetAccountName; 
        private String assetId; 
        private Long effectEndTime; 
        private Long effectStartTime; 
        private String instanceId; 
        private Boolean isOneTimeEffect; 
        private Long projectId; 
        private String protocolName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOperationTicketRequest request) {
            super(request);
            this.approveComment = request.approveComment;
            this.assetAccountName = request.assetAccountName;
            this.assetId = request.assetId;
            this.effectEndTime = request.effectEndTime;
            this.effectStartTime = request.effectStartTime;
            this.instanceId = request.instanceId;
            this.isOneTimeEffect = request.isOneTimeEffect;
            this.projectId = request.projectId;
            this.protocolName = request.protocolName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The remarks of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Comment</p>
         */
        public Builder approveComment(String approveComment) {
            this.putQueryParameter("ApproveComment", approveComment);
            this.approveComment = approveComment;
            return this;
        }

        /**
         * <p>The logon name of the asset account for which you want to request O&amp;M access.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder assetAccountName(String assetAccountName) {
            this.putQueryParameter("AssetAccountName", assetAccountName);
            this.assetAccountName = assetAccountName;
            return this;
        }

        /**
         * <p>The ID of the asset for which you want to request O&amp;M access.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758856.html">ListOperationDatabases</a> or <a href="https://help.aliyun.com/document_detail/2758857.html">ListOperationHosts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder assetId(String assetId) {
            this.putQueryParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>The end time of the validity period for the logon request. Unit: seconds. The value is a UNIX timestamp.</p>
         * <blockquote>
         * <p>The end time of the validity period must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1679393152</p>
         */
        public Builder effectEndTime(Long effectEndTime) {
            this.putQueryParameter("EffectEndTime", effectEndTime);
            this.effectEndTime = effectEndTime;
            return this;
        }

        /**
         * <p>The start time of the validity period for the logon request. Unit: seconds. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1685600242</p>
         */
        public Builder effectStartTime(Long effectStartTime) {
            this.putQueryParameter("EffectStartTime", effectStartTime);
            this.effectStartTime = effectStartTime;
            return this;
        }

        /**
         * <p>The instance ID of the bastion host.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of logon times allowed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Only one logon is allowed within the validity period.</li>
         * <li><strong>false</strong>: Unlimited logons are allowed within the validity period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isOneTimeEffect(Boolean isOneTimeEffect) {
            this.putQueryParameter("IsOneTimeEffect", isOneTimeEffect);
            this.isOneTimeEffect = isOneTimeEffect;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the protocol for which you want to request O&amp;M access. Valid values:</p>
         * <ul>
         * <li>SSH</li>
         * <li>RDP</li>
         * <li>MySQL</li>
         * <li>PostgreSQL</li>
         * <li>Oracle</li>
         * <li>SQLServer</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        public Builder protocolName(String protocolName) {
            this.putQueryParameter("ProtocolName", protocolName);
            this.protocolName = protocolName;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateOperationTicketRequest build() {
            return new CreateOperationTicketRequest(this);
        } 

    } 

}
