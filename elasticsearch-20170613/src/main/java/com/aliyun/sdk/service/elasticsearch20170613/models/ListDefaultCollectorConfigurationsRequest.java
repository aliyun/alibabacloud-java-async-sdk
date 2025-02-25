// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDefaultCollectorConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>ListDefaultCollectorConfigurationsRequest</p>
 */
public class ListDefaultCollectorConfigurationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
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

        private Builder(ListDefaultCollectorConfigurationsRequest request) {
            super(request);
            this.resType = request.resType;
            this.resVersion = request.resVersion;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The shipper type. Valid values:</p>
         * <ul>
         * <li>fileBeat</li>
         * <li>metricBeat</li>
         * <li>heartBeat</li>
         * <li>auditBeat</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileBeat</p>
         */
        public Builder resType(String resType) {
            this.putQueryParameter("resType", resType);
            this.resType = resType;
            return this;
        }

        /**
         * <p>The shipper version. The shipper version varies based on the type of the machine on which the shipper is deployed. Valid values:</p>
         * <ul>
         * <li>ECS: 6.8.5_with_community</li>
         * <li>ACK: 6.8.13_with_community</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6.8.5_with_community</p>
         */
        public Builder resVersion(String resVersion) {
            this.putQueryParameter("resVersion", resVersion);
            this.resVersion = resVersion;
            return this;
        }

        /**
         * <p>The type of the machine on which the shipper is deployed. If you do not configure this parameter, the default configuration files of shippers deployed on all types of machines are returned. Valid values:</p>
         * <ul>
         * <li>ECS: ECS instance</li>
         * <li>ACK: ACK cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
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
