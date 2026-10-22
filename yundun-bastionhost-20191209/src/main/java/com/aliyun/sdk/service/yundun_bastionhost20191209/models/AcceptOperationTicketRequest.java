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
 * {@link AcceptOperationTicketRequest} extends {@link RequestModel}
 *
 * <p>AcceptOperationTicketRequest</p>
 */
public class AcceptOperationTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectCount")
    private String effectCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectEndTime")
    private String effectEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectStartTime")
    private String effectStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationTicketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AcceptOperationTicketRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.effectCount = builder.effectCount;
        this.effectEndTime = builder.effectEndTime;
        this.effectStartTime = builder.effectStartTime;
        this.instanceId = builder.instanceId;
        this.operationTicketId = builder.operationTicketId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptOperationTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return effectCount
     */
    public String getEffectCount() {
        return this.effectCount;
    }

    /**
     * @return effectEndTime
     */
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

    /**
     * @return effectStartTime
     */
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationTicketId
     */
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AcceptOperationTicketRequest, Builder> {
        private String comment; 
        private String effectCount; 
        private String effectEndTime; 
        private String effectStartTime; 
        private String instanceId; 
        private String operationTicketId; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AcceptOperationTicketRequest request) {
            super(request);
            this.comment = request.comment;
            this.effectCount = request.effectCount;
            this.effectEndTime = request.effectEndTime;
            this.effectStartTime = request.effectStartTime;
            this.instanceId = request.instanceId;
            this.operationTicketId = request.operationTicketId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The approval remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The limit on the number of logons allowed. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: No limit on the number of logons. The O&amp;M engineer can log on an unlimited number of times during the validity period.</p>
         * </li>
         * <li><p><strong>1</strong>: The O&amp;M engineer can log on only once during the validity period.</p>
         * <blockquote>
         * <ul>
         * <li>The logon limit for database asset O&amp;M approval can only be set to no limit on the number of logons in Settings.</li>
         * <li>If an empty character string is passed, the default value is no limit on the number of logons.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder effectCount(String effectCount) {
            this.putQueryParameter("EffectCount", effectCount);
            this.effectCount = effectCount;
            return this;
        }

        /**
         * <p>The end time of the validity period for logon (in seconds, UNIX timestamp format).</p>
         * 
         * <strong>example:</strong>
         * <p>1679393152</p>
         */
        public Builder effectEndTime(String effectEndTime) {
            this.putQueryParameter("EffectEndTime", effectEndTime);
            this.effectEndTime = effectEndTime;
            return this;
        }

        /**
         * <p>The start time of the validity period for logon (in seconds, UNIX timestamp format).</p>
         * 
         * <strong>example:</strong>
         * <p>1685600242</p>
         */
        public Builder effectStartTime(String effectStartTime) {
            this.putQueryParameter("EffectStartTime", effectStartTime);
            this.effectStartTime = effectStartTime;
            return this;
        }

        /**
         * <p>The ID of the bastion host instance.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
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
         * <p>The ID of the O&amp;M request to approve.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2584313.html">ListOperationTickets</a> operation to query all OperationTicketId values that require approval.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder operationTicketId(String operationTicketId) {
            this.putQueryParameter("OperationTicketId", operationTicketId);
            this.operationTicketId = operationTicketId;
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
        public AcceptOperationTicketRequest build() {
            return new AcceptOperationTicketRequest(this);
        } 

    } 

}
