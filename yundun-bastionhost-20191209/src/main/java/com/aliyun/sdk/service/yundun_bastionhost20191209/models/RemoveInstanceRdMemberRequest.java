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
 * {@link RemoveInstanceRdMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveInstanceRdMemberRequest</p>
 */
public class RemoveInstanceRdMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private RemoveInstanceRdMemberRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.memberId = builder.memberId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInstanceRdMemberRequest create() {
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
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveInstanceRdMemberRequest, Builder> {
        private String instanceId; 
        private String memberId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInstanceRdMemberRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.memberId = request.memberId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
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
         * <p>The UID of the RD member account to remove.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1597141696147832</p>
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The region ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>For more information about regions and zones, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public RemoveInstanceRdMemberRequest build() {
            return new RemoveInstanceRdMemberRequest(this);
        } 

    } 

}
