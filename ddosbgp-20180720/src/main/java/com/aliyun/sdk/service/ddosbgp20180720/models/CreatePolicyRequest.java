// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link CreatePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyRequest</p>
 */
public class CreatePolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortVersion")
    private String portVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreatePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.portVersion = builder.portVersion;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return portVersion
     */
    public String getPortVersion() {
        return this.portVersion;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreatePolicyRequest, Builder> {
        private String regionId; 
        private String name; 
        private String portVersion; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.portVersion = request.portVersion;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The policy name.</p>
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
         * <p>The version of the port-specific mitigation policy. Valid values:</p>
         * <ul>
         * <li><strong>Not specified</strong>: creates a default surf DPI engine policy.</li>
         * <li><strong>2</strong>: creates a new stream DPI engine policy.<blockquote>
         * <p>Only port-specific mitigation policies support this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder portVersion(String portVersion) {
            this.putQueryParameter("PortVersion", portVersion);
            this.portVersion = portVersion;
            return this;
        }

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><strong>l3</strong>: IP-specific mitigation policy.</li>
         * <li><strong>l4</strong>: port-specific mitigation policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>l3</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreatePolicyRequest build() {
            return new CreatePolicyRequest(this);
        } 

    } 

}
