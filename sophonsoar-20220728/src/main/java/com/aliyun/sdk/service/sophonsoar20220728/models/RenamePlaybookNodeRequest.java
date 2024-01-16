// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenamePlaybookNodeRequest} extends {@link RequestModel}
 *
 * <p>RenamePlaybookNodeRequest</p>
 */
public class RenamePlaybookNodeRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NewNodeName")
    @Validation(required = true)
    private String newNodeName;

    @Query
    @NameInMap("OldNodeName")
    @Validation(required = true)
    private String oldNodeName;

    @Query
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private RenamePlaybookNodeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.newNodeName = builder.newNodeName;
        this.oldNodeName = builder.oldNodeName;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenamePlaybookNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return newNodeName
     */
    public String getNewNodeName() {
        return this.newNodeName;
    }

    /**
     * @return oldNodeName
     */
    public String getOldNodeName() {
        return this.oldNodeName;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<RenamePlaybookNodeRequest, Builder> {
        private String lang; 
        private String newNodeName; 
        private String oldNodeName; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(RenamePlaybookNodeRequest request) {
            super(request);
            this.lang = request.lang;
            this.newNodeName = request.newNodeName;
            this.oldNodeName = request.oldNodeName;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The new name of the node.
         */
        public Builder newNodeName(String newNodeName) {
            this.putQueryParameter("NewNodeName", newNodeName);
            this.newNodeName = newNodeName;
            return this;
        }

        /**
         * The original name of the node.
         */
        public Builder oldNodeName(String oldNodeName) {
            this.putQueryParameter("OldNodeName", oldNodeName);
            this.oldNodeName = oldNodeName;
            return this;
        }

        /**
         * The UUID of the playbook.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the UUIDs of playbooks.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public RenamePlaybookNodeRequest build() {
            return new RenamePlaybookNodeRequest(this);
        } 

    } 

}
