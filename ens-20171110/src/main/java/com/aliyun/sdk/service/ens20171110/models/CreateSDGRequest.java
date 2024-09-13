// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSDGRequest} extends {@link RequestModel}
 *
 * <p>CreateSDGRequest</p>
 */
public class CreateSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromSDGId")
    private String fromSDGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    private CreateSDGRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fromSDGId = builder.fromSDGId;
        this.instanceId = builder.instanceId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSDGRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fromSDGId
     */
    public String getFromSDGId() {
        return this.fromSDGId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<CreateSDGRequest, Builder> {
        private String description; 
        private String fromSDGId; 
        private String instanceId; 
        private String size; 

        private Builder() {
            super();
        } 

        private Builder(CreateSDGRequest request) {
            super(request);
            this.description = request.description;
            this.fromSDGId = request.fromSDGId;
            this.instanceId = request.instanceId;
            this.size = request.size;
        } 

        /**
         * The description of the SDG.
         * <p>
         * 
         * >  We recommend that you specify this parameter in details for subsequent queries.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the SDG from which you want to create an SDG.
         * <p>
         * 
         * > 
         * 
         * *   The first time you create an SDG, the **FromSDGId** parameter is empty.
         * 
         * *   If the value of the **FromSDGId** parameter is invalid or does not correspond to an original disk, an error is reported.
         * 
         * *   If the value of the **FromSDGId** parameter is not empty, you have created an SDG, and the operation is performed on the existing SDG.
         */
        public Builder fromSDGId(String fromSDGId) {
            this.putQueryParameter("FromSDGId", fromSDGId);
            this.fromSDGId = fromSDGId;
            return this;
        }

        /**
         * The ID of the AIC instance. You can call the [DescribeARMServerInstances](~~DescribeARMServerInstances~~) operation to query the ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The maximum capacity of the SDG. Unit: GB.
         * <p>
         * 
         * > 
         * 
         * *   To save costs, we recommend that you specify this parameter based on your business requirements.
         * 
         * *   The first time that you create an SDG, the **Size** parameter is required.
         * 
         * *   When the amount of data increases, you can pass a new **Size** parameter for resizing. If the value of the new **Size** parameter is greater than the value of the old **Size** parameter, the disk size of the SDG is increased to the size that is specified by the new **Size** parameter. If the value of the new **Size** parameter is empty or smaller than that of the old **Size** parameter, no operation is performed.
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public CreateSDGRequest build() {
            return new CreateSDGRequest(this);
        } 

    } 

}
