// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckQuaraFileIdRequest} extends {@link RequestModel}
 *
 * <p>CheckQuaraFileIdRequest</p>
 */
public class CheckQuaraFileIdRequest extends Request {
    @Query
    @NameInMap("QuaraFileIds")
    private java.util.List < String > quaraFileIds;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private CheckQuaraFileIdRequest(Builder builder) {
        super(builder);
        this.quaraFileIds = builder.quaraFileIds;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckQuaraFileIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quaraFileIds
     */
    public java.util.List < String > getQuaraFileIds() {
        return this.quaraFileIds;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CheckQuaraFileIdRequest, Builder> {
        private java.util.List < String > quaraFileIds; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(CheckQuaraFileIdRequest request) {
            super(request);
            this.quaraFileIds = request.quaraFileIds;
            this.uuid = request.uuid;
        } 

        /**
         * QuaraFileIds.
         */
        public Builder quaraFileIds(java.util.List < String > quaraFileIds) {
            this.putQueryParameter("QuaraFileIds", quaraFileIds);
            this.quaraFileIds = quaraFileIds;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public CheckQuaraFileIdRequest build() {
            return new CheckQuaraFileIdRequest(this);
        } 

    } 

}
