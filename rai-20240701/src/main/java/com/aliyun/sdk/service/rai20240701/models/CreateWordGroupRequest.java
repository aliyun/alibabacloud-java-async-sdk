// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link CreateWordGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateWordGroupRequest</p>
 */
public class CreateWordGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyData")
    private BodyData bodyData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commit")
    private Boolean commit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private CreateWordGroupRequest(Builder builder) {
        super(builder);
        this.bodyData = builder.bodyData;
        this.commit = builder.commit;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWordGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodyData
     */
    public BodyData getBodyData() {
        return this.bodyData;
    }

    /**
     * @return commit
     */
    public Boolean getCommit() {
        return this.commit;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateWordGroupRequest, Builder> {
        private BodyData bodyData; 
        private Boolean commit; 
        private String groupName; 
        private String regionId; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWordGroupRequest request) {
            super(request);
            this.bodyData = request.bodyData;
            this.commit = request.commit;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Request object</p>
         */
        public Builder bodyData(BodyData bodyData) {
            String bodyDataShrink = shrink(bodyData, "BodyData", "json");
            this.putBodyParameter("BodyData", bodyDataShrink);
            this.bodyData = bodyData;
            return this;
        }

        /**
         * <p>Whether to commit.
         * false: Not actually saved, only checked
         * true: Commit and save</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder commit(Boolean commit) {
            this.putQueryParameter("Commit", commit);
            this.commit = commit;
            return this;
        }

        /**
         * <p>Keyword group name</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>643168</p>
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateWordGroupRequest build() {
            return new CreateWordGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWordGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateWordGroupRequest</p>
     */
    public static class WordInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private WordInfoList(Builder builder) {
            this.label = builder.label;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordInfoList create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String label; 
            private String word; 

            private Builder() {
            } 

            private Builder(WordInfoList model) {
                this.label = model.label;
                this.word = model.word;
            } 

            /**
             * <p>Label</p>
             * 
             * <strong>example:</strong>
             * <p>Buss.</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Keyword</p>
             * 
             * <strong>example:</strong>
             * <p>Inv.</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public WordInfoList build() {
                return new WordInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWordGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateWordGroupRequest</p>
     */
    public static class BodyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WordInfoList")
        private java.util.List<WordInfoList> wordInfoList;

        private BodyData(Builder builder) {
            this.wordInfoList = builder.wordInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyData create() {
            return builder().build();
        }

        /**
         * @return wordInfoList
         */
        public java.util.List<WordInfoList> getWordInfoList() {
            return this.wordInfoList;
        }

        public static final class Builder {
            private java.util.List<WordInfoList> wordInfoList; 

            private Builder() {
            } 

            private Builder(BodyData model) {
                this.wordInfoList = model.wordInfoList;
            } 

            /**
             * <p>Keyword group list</p>
             */
            public Builder wordInfoList(java.util.List<WordInfoList> wordInfoList) {
                this.wordInfoList = wordInfoList;
                return this;
            }

            public BodyData build() {
                return new BodyData(this);
            } 

        } 

    }
}
