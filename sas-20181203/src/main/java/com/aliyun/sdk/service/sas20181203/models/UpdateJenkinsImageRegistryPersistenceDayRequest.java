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
 * {@link UpdateJenkinsImageRegistryPersistenceDayRequest} extends {@link RequestModel}
 *
 * <p>UpdateJenkinsImageRegistryPersistenceDayRequest</p>
 */
public class UpdateJenkinsImageRegistryPersistenceDayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PersistenceDay")
    private Integer persistenceDay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryId")
    private Long registryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private UpdateJenkinsImageRegistryPersistenceDayRequest(Builder builder) {
        super(builder);
        this.persistenceDay = builder.persistenceDay;
        this.registryId = builder.registryId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJenkinsImageRegistryPersistenceDayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return persistenceDay
     */
    public Integer getPersistenceDay() {
        return this.persistenceDay;
    }

    /**
     * @return registryId
     */
    public Long getRegistryId() {
        return this.registryId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<UpdateJenkinsImageRegistryPersistenceDayRequest, Builder> {
        private Integer persistenceDay; 
        private Long registryId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJenkinsImageRegistryPersistenceDayRequest request) {
            super(request);
            this.persistenceDay = request.persistenceDay;
            this.registryId = request.registryId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The retention period. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder persistenceDay(Integer persistenceDay) {
            this.putBodyParameter("PersistenceDay", persistenceDay);
            this.persistenceDay = persistenceDay;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * <blockquote>
         * <p>You can call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to query the IDs of image repositories.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>25363</p>
         */
        public Builder registryId(Long registryId) {
            this.putBodyParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>106.11.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public UpdateJenkinsImageRegistryPersistenceDayRequest build() {
            return new UpdateJenkinsImageRegistryPersistenceDayRequest(this);
        } 

    } 

}
