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
 * {@link EditShowAndReplaceRequest} extends {@link RequestModel}
 *
 * <p>EditShowAndReplaceRequest</p>
 */
public class EditShowAndReplaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Float endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String showId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Float startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageInfo")
    private String storageInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private EditShowAndReplaceRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.showId = builder.showId;
        this.startTime = builder.startTime;
        this.storageInfo = builder.storageInfo;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditShowAndReplaceRequest create() {
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
     * @return endTime
     */
    public Float getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    /**
     * @return startTime
     */
    public Float getStartTime() {
        return this.startTime;
    }

    /**
     * @return storageInfo
     */
    public String getStorageInfo() {
        return this.storageInfo;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<EditShowAndReplaceRequest, Builder> {
        private String casterId; 
        private Float endTime; 
        private Long ownerId; 
        private String regionId; 
        private String showId; 
        private Float startTime; 
        private String storageInfo; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(EditShowAndReplaceRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.showId = request.showId;
            this.startTime = request.startTime;
            this.storageInfo = request.storageInfo;
            this.userData = request.userData;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>53200b81-b761-4c10-842a-a0726d97****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The end time of the editing task. Unit: seconds.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The valid values range from 0 to the value indicated by the total length of the episode.</p>
         * </li>
         * <li><p>By default, this parameter is set to the value that indicates the total length of the episode. The editing period cannot exceed the total length of the episode.</p>
         * </li>
         * <li><p>If you want to edit a VOD file from the 2nd second to the 5th second, set the StartTime parameter to 2.0 and the EndTime parameter to 5.0.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder endTime(Float endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the episode to be edited.</p>
         * <blockquote>
         * <p> You can obtain the ID from the response parameter ShowId of the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>42200b81-b761-4c10-842a-a0726d97****</p>
         */
        public Builder showId(String showId) {
            this.putQueryParameter("ShowId", showId);
            this.showId = showId;
            return this;
        }

        /**
         * <p>The start time of the editing task. Unit: seconds.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The valid values range from 0 to the value indicated by the total length of the episode. By default, the editing task starts from the beginning of the episode. Default value: 0.0.</p>
         * </li>
         * <li><p>If you want to edit a VOD file from the 2nd second to the 5th second, set the StartTime parameter to 2.0 and the EndTime parameter to 5.0.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder startTime(Float startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The storage information of the episode. The following fields are included:</p>
         * <ul>
         * <li><strong>StorageLocation</strong>: the storage location of ApsaraVideo VOD.</li>
         * <li><strong>FileName</strong>: the custom file name.</li>
         * </ul>
         * <blockquote>
         * <p> Editing outputs must be stored in the VOD bucket within the same account that is used to access both ApsaraVideo VOD and ApsaraVideo Live. For more information about how to obtain the storage location, see <a href="https://help.aliyun.com/document_detail/86097.html">Manage VOD resources</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;StorageLocation&quot;:&quot;<em><strong>bucket</strong></em>&quot;, &quot;FileName&quot;:&quot;EditFile****.mp4&quot; }</p>
         */
        public Builder storageInfo(String storageInfo) {
            this.putQueryParameter("StorageInfo", storageInfo);
            this.storageInfo = storageInfo;
            return this;
        }

        /**
         * <p>The user information.</p>
         * 
         * <strong>example:</strong>
         * <p>900a2b2r8-13c2-****-88f2-75e4a07c1ed9</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public EditShowAndReplaceRequest build() {
            return new EditShowAndReplaceRequest(this);
        } 

    } 

}
