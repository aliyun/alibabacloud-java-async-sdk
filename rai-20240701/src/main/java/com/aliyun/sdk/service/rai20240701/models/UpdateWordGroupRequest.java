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
 * {@link UpdateWordGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateWordGroupRequest</p>
 */
public class UpdateWordGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyData")
    private BodyData bodyData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commit")
    private Boolean commit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WordInfoListModified")
    private Boolean wordInfoListModified;

    private UpdateWordGroupRequest(Builder builder) {
        super(builder);
        this.bodyData = builder.bodyData;
        this.commit = builder.commit;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
        this.wordInfoListModified = builder.wordInfoListModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWordGroupRequest create() {
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
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
     * @return wordInfoListModified
     */
    public Boolean getWordInfoListModified() {
        return this.wordInfoListModified;
    }

    public static final class Builder extends Request.Builder<UpdateWordGroupRequest, Builder> {
        private BodyData bodyData; 
        private Boolean commit; 
        private Long groupId; 
        private String groupName; 
        private String regionId; 
        private Boolean wordInfoListModified; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWordGroupRequest request) {
            super(request);
            this.bodyData = request.bodyData;
            this.commit = request.commit;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
            this.wordInfoListModified = request.wordInfoListModified;
        } 

        /**
         * <p>Request object.</p>
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
         * <p>Keyword group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Keyword group name.</p>
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
         * <p>Whether the keyword information has been modified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder wordInfoListModified(Boolean wordInfoListModified) {
            this.putQueryParameter("WordInfoListModified", wordInfoListModified);
            this.wordInfoListModified = wordInfoListModified;
            return this;
        }

        @Override
        public UpdateWordGroupRequest build() {
            return new UpdateWordGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWordGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateWordGroupRequest</p>
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
             * <p>Label.</p>
             * 
             * <strong>example:</strong>
             * <p>Buss.</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Keyword.</p>
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
     * {@link UpdateWordGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateWordGroupRequest</p>
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
             * <p>List of keyword groups.</p>
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
