// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link AddPlaylistItemsRequest} extends {@link RequestModel}
 *
 * <p>AddPlaylistItemsRequest</p>
 */
public class AddPlaylistItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramConfig")
    private String programConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramId")
    private String programId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddPlaylistItemsRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.programConfig = builder.programConfig;
        this.programId = builder.programId;
        this.programItems = builder.programItems;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPlaylistItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return programConfig
     */
    public String getProgramConfig() {
        return this.programConfig;
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return programItems
     */
    public String getProgramItems() {
        return this.programItems;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddPlaylistItemsRequest, Builder> {
        private String casterId; 
        private Long ownerId; 
        private String programConfig; 
        private String programId; 
        private String programItems; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddPlaylistItemsRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.programConfig = request.programConfig;
            this.programId = request.programId;
            this.programItems = request.programItems;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>The production studio must use the following configurations:</p>
         * <ul>
         * <li><strong>NormType</strong>: 3****. You need to call the <strong>CreateCaster</strong> operation to create a production studio for lightweight carousel playback in advance.</li>
         * <li><strong>CasterTemplate</strong>: lp_noTranscode.</li>
         * <li><strong>channelEnable</strong>: 0.</li>
         * <li><strong>programEffect</strong>: 1.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0e94d1f4-1a65-445c-9dcf-de8b3b8d****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The configurations of the episode list. If the episode list is added to the production studio for the first time, specify this parameter to pass in the initial configurations. For more information, see the <strong>ProgramConfig</strong> section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;RepeatNumber&quot;:&quot;0&quot;,&quot;ProgramName&quot;:&quot;my program&quot;}]</p>
         */
        public Builder programConfig(String programConfig) {
            this.putQueryParameter("ProgramConfig", programConfig);
            this.programConfig = programConfig;
            return this;
        }

        /**
         * <p>The ID of the episode list. If you do not specify this parameter, an episode list is created by default.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder programId(String programId) {
            this.putQueryParameter("ProgramId", programId);
            this.programId = programId;
            return this;
        }

        /**
         * <p>The episodes that you want to add to the production studio. The value is a JSON string. For more information, see the <strong>InputProgramItem</strong> section of this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ItemName&quot;:&quot;item1&quot;,&quot;ResourceType&quot;:&quot;vod&quot;,&quot;ResourceValue&quot;:&quot;5f8809f2-3352-4d1f-a8f7-86f9429f****&quot;}, {&quot;ItemName&quot;: &quot;item2&quot;,&quot;ResourceType&quot;: &quot;vod&quot;,&quot;ResourceValue&quot;: &quot;e7411c0b-dd98-4c61-a545-f8bfba6c****&quot;}]</p>
         */
        public Builder programItems(String programItems) {
            this.putQueryParameter("ProgramItems", programItems);
            this.programItems = programItems;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddPlaylistItemsRequest build() {
            return new AddPlaylistItemsRequest(this);
        } 

    } 

}
