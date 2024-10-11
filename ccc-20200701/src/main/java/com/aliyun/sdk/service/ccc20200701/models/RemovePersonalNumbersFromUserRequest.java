// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemovePersonalNumbersFromUserRequest} extends {@link RequestModel}
 *
 * <p>RemovePersonalNumbersFromUserRequest</p>
 */
public class RemovePersonalNumbersFromUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String numberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private RemovePersonalNumbersFromUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePersonalNumbersFromUserRequest create() {
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RemovePersonalNumbersFromUserRequest, Builder> {
        private String instanceId; 
        private String numberList; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RemovePersonalNumbersFromUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
            this.userId = request.userId;
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
         * <p>[&quot;0101234****&quot;, &quot;0105678****&quot;]</p>
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
         * <p>agent@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RemovePersonalNumbersFromUserRequest build() {
            return new RemovePersonalNumbersFromUserRequest(this);
        } 

    } 

}
