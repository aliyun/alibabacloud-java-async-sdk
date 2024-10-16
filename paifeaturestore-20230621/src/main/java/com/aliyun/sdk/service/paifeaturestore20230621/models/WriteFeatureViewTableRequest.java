// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WriteFeatureViewTableRequest} extends {@link RequestModel}
 *
 * <p>WriteFeatureViewTableRequest</p>
 */
public class WriteFeatureViewTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureViewId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Partitions")
    private java.util.Map < String, java.util.Map<String, ?>> partitions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UrlDatasource")
    private UrlDatasource urlDatasource;

    private WriteFeatureViewTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.featureViewId = builder.featureViewId;
        this.regionId = builder.regionId;
        this.mode = builder.mode;
        this.partitions = builder.partitions;
        this.urlDatasource = builder.urlDatasource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WriteFeatureViewTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return featureViewId
     */
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return partitions
     */
    public java.util.Map < String, java.util.Map<String, ?>> getPartitions() {
        return this.partitions;
    }

    /**
     * @return urlDatasource
     */
    public UrlDatasource getUrlDatasource() {
        return this.urlDatasource;
    }

    public static final class Builder extends Request.Builder<WriteFeatureViewTableRequest, Builder> {
        private String instanceId; 
        private String featureViewId; 
        private String regionId; 
        private String mode; 
        private java.util.Map < String, java.util.Map<String, ?>> partitions; 
        private UrlDatasource urlDatasource; 

        private Builder() {
            super();
        } 

        private Builder(WriteFeatureViewTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.featureViewId = request.featureViewId;
            this.regionId = request.regionId;
            this.mode = request.mode;
            this.partitions = request.partitions;
            this.urlDatasource = request.urlDatasource;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder featureViewId(String featureViewId) {
            this.putPathParameter("FeatureViewId", featureViewId);
            this.featureViewId = featureViewId;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Merge</p>
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Partitions.
         */
        public Builder partitions(java.util.Map < String, java.util.Map<String, ?>> partitions) {
            this.putBodyParameter("Partitions", partitions);
            this.partitions = partitions;
            return this;
        }

        /**
         * UrlDatasource.
         */
        public Builder urlDatasource(UrlDatasource urlDatasource) {
            this.putBodyParameter("UrlDatasource", urlDatasource);
            this.urlDatasource = urlDatasource;
            return this;
        }

        @Override
        public WriteFeatureViewTableRequest build() {
            return new WriteFeatureViewTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link WriteFeatureViewTableRequest} extends {@link TeaModel}
     *
     * <p>WriteFeatureViewTableRequest</p>
     */
    public static class UrlDatasource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delimiter")
        private String delimiter;

        @com.aliyun.core.annotation.NameInMap("OmitHeader")
        private Boolean omitHeader;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private UrlDatasource(Builder builder) {
            this.delimiter = builder.delimiter;
            this.omitHeader = builder.omitHeader;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlDatasource create() {
            return builder().build();
        }

        /**
         * @return delimiter
         */
        public String getDelimiter() {
            return this.delimiter;
        }

        /**
         * @return omitHeader
         */
        public Boolean getOmitHeader() {
            return this.omitHeader;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String delimiter; 
            private Boolean omitHeader; 
            private String path; 

            /**
             * Delimiter.
             */
            public Builder delimiter(String delimiter) {
                this.delimiter = delimiter;
                return this;
            }

            /**
             * OmitHeader.
             */
            public Builder omitHeader(Boolean omitHeader) {
                this.omitHeader = omitHeader;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public UrlDatasource build() {
                return new UrlDatasource(this);
            } 

        } 

    }
}
