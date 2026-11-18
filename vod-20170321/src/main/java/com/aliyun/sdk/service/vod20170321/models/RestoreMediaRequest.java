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
         * <p>The media IDs, which are audio or video IDs (VideoId). Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain the IDs by using the following methods:</p>
         * <ul>
         * <li>For audio or video files uploaded in the console, log on to the ApsaraVideo VOD console and choose Media Files &gt; Audio/Video to view the audio or video ID.</li>
         * <li>When you call the CreateUploadVideo operation to obtain the upload URL and credential, the video ID is the value of the VideoId parameter in the response.</li>
         * <li>After the audio or video file is uploaded, you can call the SearchMedia operation to query the video ID, which is the value of the VideoId parameter in the response.</li>
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
         * <p>The restoration duration. Default value: 1 day. Maximum value for Archive media assets: 7 days. Maximum value for Cold Archive media assets: 365 days.</p>
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
         * <p>The restoration priority. This parameter is required only for Cold Archive media assets. If this parameter is not specified, the default value <strong>Standard</strong> is used. Valid values:</p>
         * <ul>
         * <li><strong>Expedited</strong>: High priority. The restoration is completed within 1 hour.</li>
         * <li><strong>Standard</strong> (default): Standard priority. The restoration is completed within 2 to 5 hours.</li>
         * <li><strong>Bulk</strong>: Batch priority. The restoration is completed within 5 to 12 hours.</li>
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
         * <p>The scope of the change. If this parameter is not specified, the default value <strong>All</strong> is used. Valid values:</p>
         * <ul>
         * <li><strong>All</strong> (default): Applies tiered storage to all resources (source files and transcoded streams) of the media asset.</li>
         * <li><strong>SourceFile</strong>: Applies tiered storage only to the video source file of the media asset ID. Resources other than the source file use Standard storage.</li>
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
