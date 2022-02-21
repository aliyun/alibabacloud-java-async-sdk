// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDefaultCollectorConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>ListDefaultCollectorConfigurationsRequest</p>
 */
public class ListDefaultCollectorConfigurationsRequest extends Request {
    @Query
    @NameInMap("resType")
    @Validation(required = true)
    private String resType;

    @Query
    @NameInMap("resVersion")
    @Validation(required = true)
    private String resVersion;

    @Query
    @NameInMap("sourceType")
    private String sourceType;

    private ListDefaultCollectorConfigurationsRequest(Builder builder) {
        super(builder);
        this.resType = builder.resType;
        this.resVersion = builder.resVersion;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDefaultCollectorConfigurationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resType
     */
    public String getResType() {
        return this.resType;
    }

    /**
     * @return resVersion
     */
    public String getResVersion() {
        return this.resVersion;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListDefaultCollectorConfigurationsRequest, Builder> {
        private String resType; 
        private String resVersion; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListDefaultCollectorConfigurationsRequest response) {
            super(response);
            this.resType = response.resType;
            this.resVersion = response.resVersion;
            this.sourceType = response.sourceType;
        } 

        /**
         * resType.
         */
        public Builder resType(String resType) {
            this.putQueryParameter("resType", resType);
            this.resType = resType;
            return this;
        }

        /**
         * resVersion.
         */
        public Builder resVersion(String resVersion) {
            this.putQueryParameter("resVersion", resVersion);
            this.resVersion = resVersion;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListDefaultCollectorConfigurationsRequest build() {
            return new ListDefaultCollectorConfigurationsRequest(this);
        } 

    } 

}
