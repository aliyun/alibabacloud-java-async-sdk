// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJenkinsImageRegistryPersistenceDayRequest} extends {@link RequestModel}
 *
 * <p>UpdateJenkinsImageRegistryPersistenceDayRequest</p>
 */
public class UpdateJenkinsImageRegistryPersistenceDayRequest extends Request {
    @Body
    @NameInMap("PersistenceDay")
    private Integer persistenceDay;

    @Body
    @NameInMap("RegistryId")
    private Long registryId;

    @Query
    @NameInMap("SourceIp")
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
         * The retention period. Unit: days.
         */
        public Builder persistenceDay(Integer persistenceDay) {
            this.putBodyParameter("PersistenceDay", persistenceDay);
            this.persistenceDay = persistenceDay;
            return this;
        }

        /**
         * The ID of the image repository.
         * <p>
         * 
         * > You can call the [PageImageRegistry](~~PageImageRegistry~~) operation to query the IDs of image repositories.
         */
        public Builder registryId(Long registryId) {
            this.putBodyParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        /**
         * The source IP address of the request.
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
