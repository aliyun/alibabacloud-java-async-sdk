// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecordUrlRequest} extends {@link RequestModel}
 *
 * <p>GetRecordUrlRequest</p>
 */
public class GetRecordUrlRequest extends Request {
    @Query
    @NameInMap("Acid")
    @Validation(required = true)
    private String acid;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RecordType")
    @Validation(required = true)
    private String recordType;

    private GetRecordUrlRequest(Builder builder) {
        super(builder);
        this.acid = builder.acid;
        this.instanceId = builder.instanceId;
        this.recordType = builder.recordType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecordUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    public static final class Builder extends Request.Builder<GetRecordUrlRequest, Builder> {
        private String acid; 
        private String instanceId; 
        private String recordType; 

        private Builder() {
            super();
        } 

        private Builder(GetRecordUrlRequest response) {
            super(response);
            this.acid = response.acid;
            this.instanceId = response.instanceId;
            this.recordType = response.recordType;
        } 

        /**
         * Acid.
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RecordType.
         */
        public Builder recordType(String recordType) {
            this.putQueryParameter("RecordType", recordType);
            this.recordType = recordType;
            return this;
        }

        @Override
        public GetRecordUrlRequest build() {
            return new GetRecordUrlRequest(this);
        } 

    } 

}
