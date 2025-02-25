// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListDispatchRuleRequest} extends {@link RequestModel}
 *
 * <p>ListDispatchRuleRequest</p>
 */
public class ListDispatchRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("System")
    private Boolean system;

    private ListDispatchRuleRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.system = builder.system;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDispatchRuleRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return system
     */
    public Boolean getSystem() {
        return this.system;
    }

    public static final class Builder extends Request.Builder<ListDispatchRuleRequest, Builder> {
        private String name; 
        private String regionId; 
        private Boolean system; 

        private Builder() {
            super();
        } 

        private Builder(ListDispatchRuleRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
            this.system = request.system;
        } 

        /**
         * <p>The name of the notification policy. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <ul>
         * <li>The type of notification policies to be queried. Valid values: <code>false</code> (default): notification policies created in Application Real-Time Monitoring Service (ARMS).</li>
         * <li><code>true</code>: notification policies created in an external system.</li>
         * </ul>
         * <blockquote>
         * <p> You cannot use the ARMS console to modify the dispatch rules of a notification policy that is created in an external system.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder system(Boolean system) {
            this.putQueryParameter("System", system);
            this.system = system;
            return this;
        }

        @Override
        public ListDispatchRuleRequest build() {
            return new ListDispatchRuleRequest(this);
        } 

    } 

}
