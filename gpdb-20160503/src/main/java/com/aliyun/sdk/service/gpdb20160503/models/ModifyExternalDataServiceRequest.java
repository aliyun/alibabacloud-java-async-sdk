// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ModifyExternalDataServiceRequest} extends {@link RequestModel}
 *
 * <p>ModifyExternalDataServiceRequest</p>
 */
public class ModifyExternalDataServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceDescription")
    private String serviceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceSpec;

    private ModifyExternalDataServiceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
        this.serviceDescription = builder.serviceDescription;
        this.serviceId = builder.serviceId;
        this.serviceSpec = builder.serviceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExternalDataServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceSpec
     */
    public String getServiceSpec() {
        return this.serviceSpec;
    }

    public static final class Builder extends Request.Builder<ModifyExternalDataServiceRequest, Builder> {
        private String DBInstanceId; 
        private String regionId; 
        private String serviceDescription; 
        private String serviceId; 
        private String serviceSpec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExternalDataServiceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
            this.serviceDescription = request.serviceDescription;
            this.serviceId = request.serviceId;
            this.serviceSpec = request.serviceSpec;
        } 

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp10g78o9807yv9h3</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> API to view available region IDs.</p>
         * </blockquote>
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
         * <p>Service description.</p>
         * 
         * <strong>example:</strong>
         * <p>pxf test</p>
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putQueryParameter("ServiceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * <p>Service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>Service specification (in CU), value:</p>
         * <ul>
         * <li>8</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder serviceSpec(String serviceSpec) {
            this.putQueryParameter("ServiceSpec", serviceSpec);
            this.serviceSpec = serviceSpec;
            return this;
        }

        @Override
        public ModifyExternalDataServiceRequest build() {
            return new ModifyExternalDataServiceRequest(this);
        } 

    } 

}
