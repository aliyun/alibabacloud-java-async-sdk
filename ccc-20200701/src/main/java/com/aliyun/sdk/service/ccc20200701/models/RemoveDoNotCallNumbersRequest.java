// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveDoNotCallNumbersRequest} extends {@link RequestModel}
 *
 * <p>RemoveDoNotCallNumbersRequest</p>
 */
public class RemoveDoNotCallNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private String numberList;

    private RemoveDoNotCallNumbersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDoNotCallNumbersRequest create() {
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
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    public static final class Builder extends Request.Builder<RemoveDoNotCallNumbersRequest, Builder> {
        private String instanceId; 
        private String numberList; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDoNotCallNumbersRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
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

        @Override
        public RemoveDoNotCallNumbersRequest build() {
            return new RemoveDoNotCallNumbersRequest(this);
        } 

    } 

}
