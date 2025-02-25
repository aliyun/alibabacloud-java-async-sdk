// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link PickOutboundNumbersRequest} extends {@link RequestModel}
 *
 * <p>PickOutboundNumbersRequest</p>
 */
public class PickOutboundNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupIdList;

    private PickOutboundNumbersRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.count = builder.count;
        this.instanceId = builder.instanceId;
        this.skillGroupIdList = builder.skillGroupIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PickOutboundNumbersRequest create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return skillGroupIdList
     */
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public static final class Builder extends Request.Builder<PickOutboundNumbersRequest, Builder> {
        private String calledNumber; 
        private Integer count; 
        private String instanceId; 
        private String skillGroupIdList; 

        private Builder() {
            super();
        } 

        private Builder(PickOutboundNumbersRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.count = request.count;
            this.instanceId = request.instanceId;
            this.skillGroupIdList = request.skillGroupIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1388888****</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;skillgroup@ccc-test&quot;]</p>
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        @Override
        public PickOutboundNumbersRequest build() {
            return new PickOutboundNumbersRequest(this);
        } 

    } 

}
