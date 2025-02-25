// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteSearchConditionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSearchConditionRequest</p>
 */
public class DeleteSearchConditionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DeleteSearchConditionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSearchConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DeleteSearchConditionRequest, Builder> {
        private String name; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSearchConditionRequest request) {
            super(request);
            this.name = request.name;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>The name of the frequently used search condition.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSearchCondition~~">DescribeSearchCondition</a> operation to query frequently used search conditions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>19.12.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the asset. Default value: ecs. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>cloud_product</strong>: an Alibaba Cloud service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DeleteSearchConditionRequest build() {
            return new DeleteSearchConditionRequest(this);
        } 

    } 

}
