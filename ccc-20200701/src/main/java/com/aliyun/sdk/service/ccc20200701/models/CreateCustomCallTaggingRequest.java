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
 * {@link CreateCustomCallTaggingRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomCallTaggingRequest</p>
 */
public class CreateCustomCallTaggingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomNumberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customNumberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private CreateCustomCallTaggingRequest(Builder builder) {
        super(builder);
        this.customNumberList = builder.customNumberList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomCallTaggingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customNumberList
     */
    public String getCustomNumberList() {
        return this.customNumberList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCustomCallTaggingRequest, Builder> {
        private String customNumberList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomCallTaggingRequest request) {
            super(request);
            this.customNumberList = request.customNumberList;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>A list of inbound control tags, formatted as a JSON array string. The number of array elements must be between 1 and 10,000. Each element in the array is an object with the following properties: number (must be a numeric string of 4 to 32 characters), description, and callTagNameList. The callTagNameList is an array whose elements are number labels (ensure that these number labels have already been created).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;number&quot;:&quot;1312121****&quot;,&quot;description&quot;:&quot;王先生&quot;,&quot;callTagNameList&quot;:[&quot;TagA&quot;]},{&quot;number&quot;:&quot;1388888****&quot;,&quot;description&quot;:&quot;张先生&quot;,&quot;callTagNameList&quot;:[&quot;TagB&quot;]}]</p>
         */
        public Builder customNumberList(String customNumberList) {
            this.putQueryParameter("CustomNumberList", customNumberList);
            this.customNumberList = customNumberList;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
        public CreateCustomCallTaggingRequest build() {
            return new CreateCustomCallTaggingRequest(this);
        } 

    } 

}
