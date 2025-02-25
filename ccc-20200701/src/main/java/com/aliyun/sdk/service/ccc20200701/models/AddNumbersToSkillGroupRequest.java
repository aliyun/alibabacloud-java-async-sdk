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
 * {@link AddNumbersToSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>AddNumbersToSkillGroupRequest</p>
 */
public class AddNumbersToSkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstNumberGroupIdList")
    private String instNumberGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private String numberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupId;

    private AddNumbersToSkillGroupRequest(Builder builder) {
        super(builder);
        this.instNumberGroupIdList = builder.instNumberGroupIdList;
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddNumbersToSkillGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instNumberGroupIdList
     */
    public String getInstNumberGroupIdList() {
        return this.instNumberGroupIdList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<AddNumbersToSkillGroupRequest, Builder> {
        private String instNumberGroupIdList; 
        private String instanceId; 
        private String numberList; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddNumbersToSkillGroupRequest request) {
            super(request);
            this.instNumberGroupIdList = request.instNumberGroupIdList;
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * InstNumberGroupIdList.
         */
        public Builder instNumberGroupIdList(String instNumberGroupIdList) {
            this.putQueryParameter("InstNumberGroupIdList", instNumberGroupIdList);
            this.instNumberGroupIdList = instNumberGroupIdList;
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
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public AddNumbersToSkillGroupRequest build() {
            return new AddNumbersToSkillGroupRequest(this);
        } 

    } 

}
