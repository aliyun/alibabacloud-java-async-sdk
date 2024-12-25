// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
         * <p>The description of the SDG.</p>
         * <blockquote>
         * <p> We recommend that you specify this parameter in details for subsequent queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Testing SDGs</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the SDG from which you want to create an SDG.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The first time you create an SDG, the <strong>FromSDGId</strong> parameter is empty.</p>
         * </li>
         * <li><p>If the value of the <strong>FromSDGId</strong> parameter is invalid or does not correspond to an original disk, an error is reported.</p>
         * </li>
         * <li><p>If the value of the <strong>FromSDGId</strong> parameter is not empty, you have created an SDG, and the operation is performed on the existing SDG.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxxx</p>
         */
        public Builder fromSDGId(String fromSDGId) {
            this.putQueryParameter("FromSDGId", fromSDGId);
            this.fromSDGId = fromSDGId;
            return this;
        }

        /**
         * <p>The ID of the AIC instance. You can call the <a href="~~DescribeARMServerInstances~~">DescribeARMServerInstances</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum capacity of the SDG. Unit: GB.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>To save costs, we recommend that you specify this parameter based on your business requirements.</p>
         * </li>
         * <li><p>The first time that you create an SDG, the <strong>Size</strong> parameter is required.</p>
         * </li>
         * <li><p>When the amount of data increases, you can pass a new <strong>Size</strong> parameter for resizing. If the value of the new <strong>Size</strong> parameter is greater than the value of the old <strong>Size</strong> parameter, the disk size of the SDG is increased to the size that is specified by the new <strong>Size</strong> parameter. If the value of the new <strong>Size</strong> parameter is empty or smaller than that of the old <strong>Size</strong> parameter, no operation is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
