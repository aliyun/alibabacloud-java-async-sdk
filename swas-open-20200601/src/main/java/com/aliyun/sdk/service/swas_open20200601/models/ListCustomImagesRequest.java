// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ListCustomImagesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomImagesRequest</p>
 */
public class ListCustomImagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSnapshotId")
    private String dataSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageIds")
    private String imageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageNames")
    private String imageNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Share")
    private Boolean share;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemSnapshotId")
    private String systemSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListCustomImagesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataSnapshotId = builder.dataSnapshotId;
        this.imageIds = builder.imageIds;
        this.imageNames = builder.imageNames;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.share = builder.share;
        this.systemSnapshotId = builder.systemSnapshotId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSnapshotId
     */
    public String getDataSnapshotId() {
        return this.dataSnapshotId;
    }

    /**
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
    }

    /**
     * @return imageNames
     */
    public String getImageNames() {
        return this.imageNames;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return share
     */
    public Boolean getShare() {
        return this.share;
    }

    /**
     * @return systemSnapshotId
     */
    public String getSystemSnapshotId() {
        return this.systemSnapshotId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListCustomImagesRequest, Builder> {
        private String clientToken; 
        private String dataSnapshotId; 
        private String imageIds; 
        private String imageNames; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean share; 
        private String systemSnapshotId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomImagesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dataSnapshotId = request.dataSnapshotId;
            this.imageIds = request.imageIds;
            this.imageNames = request.imageNames;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.share = request.share;
            this.systemSnapshotId = request.systemSnapshotId;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the data disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-acscasca****</p>
         */
        public Builder dataSnapshotId(String dataSnapshotId) {
            this.putQueryParameter("DataSnapshotId", dataSnapshotId);
            this.dataSnapshotId = dataSnapshotId;
            return this;
        }

        /**
         * <p>The image IDs of the simple application server. The value can be a JSON array that consists of up to 100 image IDs. Separate multiple image IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;fe9c66133a9d4688872869726b52****&quot;, &quot;794c230fd3e64ea19f83f4d7a0ad****&quot;]</p>
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * <p>The image names of the simple application servers. The value can be a JSON array that consists of up to 100 image names. Separate multiple image names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;test1****&quot;, &quot;test2****&quot;]</p>
         */
        public Builder imageNames(String imageNames) {
            this.putQueryParameter("ImageNames", imageNames);
            this.imageNames = imageNames;
            return this;
        }

        /**
         * <p>The ID of the simple application server from which the image is derived.</p>
         * 
         * <strong>example:</strong>
         * <p>ace0706b2ac4454d984295a94213****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Maximum value: 100.</li>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the simple application servers corresponding to the custom images. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2bti7cf7yj2i</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to query shared images. Valid values:</p>
         * <ul>
         * <li>False: do not query shared images. The shared images are not included in the response.</li>
         * <li>True: query shared images. The shared images are included in the response.</li>
         * </ul>
         * <p>If you do not specify this parameter, all images are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder share(Boolean share) {
            this.putQueryParameter("Share", share);
            this.share = share;
            return this;
        }

        /**
         * <p>The ID of the system disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp14m09pq8***0g6</p>
         */
        public Builder systemSnapshotId(String systemSnapshotId) {
            this.putQueryParameter("SystemSnapshotId", systemSnapshotId);
            this.systemSnapshotId = systemSnapshotId;
            return this;
        }

        /**
         * <p>Tag N of the custom image.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListCustomImagesRequest build() {
            return new ListCustomImagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomImagesRequest} extends {@link TeaModel}
     *
     * <p>ListCustomImagesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * <p>The key of tag N. A tag key can be 1 to 64 characters in length. Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N. A tag value can be up to 64 characters in length. Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
