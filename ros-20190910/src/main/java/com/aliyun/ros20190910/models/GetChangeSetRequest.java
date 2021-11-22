// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetChangeSetRequest} extends {@link RequestModel}
 *
 * <p>GetChangeSetRequest</p>
 */
public class GetChangeSetRequest extends Request {
    @Query
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowTemplate")
    private Boolean showTemplate;


    private GetChangeSetRequest(Builder builder) {
        super(builder);
        this.changeSetId = builder.changeSetId;
        this.regionId = builder.regionId;
        this.showTemplate = builder.showTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeSetRequest create() {
        return builder().build();
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showTemplate
     */
    public Boolean getShowTemplate() {
        return this.showTemplate;
    }

    public static final class Builder extends Request.Builder {
        private String changeSetId; 
        private String regionId; 
        private Boolean showTemplate; 

        /**
         * <p>ChangeSetId.</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>ShowTemplate.</p>
         */
        public Builder showTemplate(Boolean showTemplate) {
            this.putQueryParameter("ShowTemplate", showTemplate);
            this.showTemplate = showTemplate;
            return this;
        }

        public GetChangeSetRequest build() {
            return new GetChangeSetRequest(this);
        } 

    } 

}
