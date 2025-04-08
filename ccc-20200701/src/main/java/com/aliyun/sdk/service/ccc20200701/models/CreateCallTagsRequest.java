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
 * {@link CreateCallTagsRequest} extends {@link RequestModel}
 *
 * <p>CreateCallTagsRequest</p>
 */
public class CreateCallTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTagNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callTagNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private CreateCallTagsRequest(Builder builder) {
        super(builder);
        this.callTagNameList = builder.callTagNameList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallTagsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callTagNameList
     */
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCallTagsRequest, Builder> {
        private String callTagNameList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCallTagsRequest request) {
            super(request);
            this.callTagNameList = request.callTagNameList;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;TagA&quot;,&quot;TagB&quot;]</p>
         */
        public Builder callTagNameList(String callTagNameList) {
            this.putQueryParameter("CallTagNameList", callTagNameList);
            this.callTagNameList = callTagNameList;
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

        @Override
        public CreateCallTagsRequest build() {
            return new CreateCallTagsRequest(this);
        } 

    } 

}
