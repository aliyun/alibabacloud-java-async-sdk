// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link RestoreMediaRequest} extends {@link RequestModel}
 *
 * <p>RestoreMediaRequest</p>
 */
public class RestoreMediaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreDays")
    private String restoreDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTier")
    private String restoreTier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private RestoreMediaRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
        this.restoreDays = builder.restoreDays;
        this.restoreTier = builder.restoreTier;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return restoreDays
     */
    public String getRestoreDays() {
        return this.restoreDays;
    }

    /**
     * @return restoreTier
     */
    public String getRestoreTier() {
        return this.restoreTier;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<RestoreMediaRequest, Builder> {
        private String mediaIds; 
        private String restoreDays; 
        private String restoreTier; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(RestoreMediaRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
            this.restoreDays = request.restoreDays;
            this.restoreTier = request.restoreTier;
            this.scope = request.scope;
        } 

        /**
         * <p>The ID of the media asset (VideoId). Separate multiple IDs with commas (,). You can specify a maximum of 20 IDs. You can use one of the following methods to obtain the ID of the media asset:</p>
         * <ul>
         * <li>Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose Media Files &gt; Audio/Video. On the Video and Audio page, view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of VideoId from the response to the CreateUploadVideo operation that you call to upload media assets.</li>
         * <li>Obtain the value of VideoId from the response to the SearchMedia operation that you call to query the media ID after the media asset is uploaded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8bc8e94fe4e55abde85718****,eb186180e989dd56****</p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * <p>The number of days during which media assets remain in the restored state. Default value: 1. The maximum validity period of a restored Archive media asset is 7 days and the maximum validity period of a restored Cold Archive media asset is 365 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder restoreDays(String restoreDays) {
            this.putQueryParameter("RestoreDays", restoreDays);
            this.restoreDays = restoreDays;
            return this;
        }

        /**
         * <p>The restoration priority. This parameter is required only when you restore a Cold Archive media file. Valid values:</p>
         * <ul>
         * <li><strong>Expedited</strong>: The file is restored within 1 hour.</li>
         * <li><strong>Standard</strong>: The file is restored within 2 to 5 hours.</li>
         * <li><strong>Bulk</strong>: The file is restored within 5 to 12 hours.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder restoreTier(String restoreTier) {
            this.putQueryParameter("RestoreTier", restoreTier);
            this.restoreTier = restoreTier;
            return this;
        }

        /**
         * <p>The modification range. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: restores all resources, including the source files and transcoded streams.</li>
         * <li><strong>SourceFile</strong>: restores only the source files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public RestoreMediaRequest build() {
            return new RestoreMediaRequest(this);
        } 

    } 

}
