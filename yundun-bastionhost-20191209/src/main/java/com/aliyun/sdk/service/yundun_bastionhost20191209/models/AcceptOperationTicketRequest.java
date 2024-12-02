// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
            this.regionId = request.regionId;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The maximum number of logons allowed. Valid values:</p>
         * <ul>
         * <li>0: The number of logons is unlimited. The O&amp;M engineer can log on to the specified asset for an unlimited number of times during the validity period.</li>
         * <li>1: The O&amp;M engineer can log on to the specified asset only once during the validity period.</li>
         * </ul>
         * <blockquote>
         * <p> You can set this parameter only to 0 if you review an O&amp;M application on a database.</p>
         * </blockquote>
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
         * <p>The end time of the validity period. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The start time of the validity period. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The ID of the bastion host.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
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
         * <p>The ID of the O&amp;M application that you want to approve. You can call the ListOperationTickets operation to query the IDs of all O&amp;M applications that require review.</p>
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
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
