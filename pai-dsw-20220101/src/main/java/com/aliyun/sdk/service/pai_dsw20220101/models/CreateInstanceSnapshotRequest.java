// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceSnapshotRequest</p>
 */
public class CreateInstanceSnapshotRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Body
    @NameInMap("Labels")
    private java.util.List < Labels> labels;

    @Body
    @NameInMap("SnapshotDescription")
    private String snapshotDescription;

    @Body
    @NameInMap("SnapshotName")
    private String snapshotName;

    private CreateInstanceSnapshotRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.imageUrl = builder.imageUrl;
        this.labels = builder.labels;
        this.snapshotDescription = builder.snapshotDescription;
        this.snapshotName = builder.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceSnapshotRequest create() {
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
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return snapshotDescription
     */
    public String getSnapshotDescription() {
        return this.snapshotDescription;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public static final class Builder extends Request.Builder<CreateInstanceSnapshotRequest, Builder> {
        private String instanceId; 
        private String imageUrl; 
        private java.util.List < Labels> labels; 
        private String snapshotDescription; 
        private String snapshotName; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceSnapshotRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.imageUrl = request.imageUrl;
            this.labels = request.labels;
            this.snapshotDescription = request.snapshotDescription;
            this.snapshotName = request.snapshotName;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * SnapshotDescription.
         */
        public Builder snapshotDescription(String snapshotDescription) {
            this.putBodyParameter("SnapshotDescription", snapshotDescription);
            this.snapshotDescription = snapshotDescription;
            return this;
        }

        /**
         * SnapshotName.
         */
        public Builder snapshotName(String snapshotName) {
            this.putBodyParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        @Override
        public CreateInstanceSnapshotRequest build() {
            return new CreateInstanceSnapshotRequest(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
