// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBoardSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBoardSnapshotResponseBody</p>
 */
public class DescribeBoardSnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshot")
    private Snapshot snapshot;

    private DescribeBoardSnapshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshot = builder.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBoardSnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshot
     */
    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    public static final class Builder {
        private String requestId; 
        private Snapshot snapshot; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Snapshot.
         */
        public Builder snapshot(Snapshot snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public DescribeBoardSnapshotResponseBody build() {
            return new DescribeBoardSnapshotResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @NameInMap("AppUid")
        private String appUid;

        @NameInMap("Data")
        private String data;

        private Configs(Builder builder) {
            this.appUid = builder.appUid;
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return appUid
         */
        public String getAppUid() {
            return this.appUid;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        public static final class Builder {
            private String appUid; 
            private String data; 

            /**
             * AppUid.
             */
            public Builder appUid(String appUid) {
                this.appUid = appUid;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    public static class Elements extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("ElementIndex")
        private String elementIndex;

        @NameInMap("ElementType")
        private Integer elementType;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private Elements(Builder builder) {
            this.data = builder.data;
            this.elementIndex = builder.elementIndex;
            this.elementType = builder.elementType;
            this.ownerId = builder.ownerId;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Elements create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return elementIndex
         */
        public String getElementIndex() {
            return this.elementIndex;
        }

        /**
         * @return elementType
         */
        public Integer getElementType() {
            return this.elementType;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String data; 
            private String elementIndex; 
            private Integer elementType; 
            private String ownerId; 
            private Long updateTimestamp; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * ElementIndex.
             */
            public Builder elementIndex(String elementIndex) {
                this.elementIndex = elementIndex;
                return this;
            }

            /**
             * ElementType.
             */
            public Builder elementType(Integer elementType) {
                this.elementType = elementType;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Elements build() {
                return new Elements(this);
            } 

        } 

    }
    public static class Pages extends TeaModel {
        @NameInMap("Elements")
        private java.util.List < Elements> elements;

        @NameInMap("PageIndex")
        private Integer pageIndex;

        private Pages(Builder builder) {
            this.elements = builder.elements;
            this.pageIndex = builder.pageIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pages create() {
            return builder().build();
        }

        /**
         * @return elements
         */
        public java.util.List < Elements> getElements() {
            return this.elements;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public static final class Builder {
            private java.util.List < Elements> elements; 
            private Integer pageIndex; 

            /**
             * Elements.
             */
            public Builder elements(java.util.List < Elements> elements) {
                this.elements = elements;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            public Pages build() {
                return new Pages(this);
            } 

        } 

    }
    public static class Board extends TeaModel {
        @NameInMap("AppUid")
        private String appUid;

        @NameInMap("BoardId")
        private String boardId;

        @NameInMap("Configs")
        private java.util.List < Configs> configs;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("EventTimestamp")
        private Long eventTimestamp;

        @NameInMap("Pages")
        private java.util.List < Pages> pages;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private Board(Builder builder) {
            this.appUid = builder.appUid;
            this.boardId = builder.boardId;
            this.configs = builder.configs;
            this.createTimestamp = builder.createTimestamp;
            this.eventTimestamp = builder.eventTimestamp;
            this.pages = builder.pages;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Board create() {
            return builder().build();
        }

        /**
         * @return appUid
         */
        public String getAppUid() {
            return this.appUid;
        }

        /**
         * @return boardId
         */
        public String getBoardId() {
            return this.boardId;
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return eventTimestamp
         */
        public Long getEventTimestamp() {
            return this.eventTimestamp;
        }

        /**
         * @return pages
         */
        public java.util.List < Pages> getPages() {
            return this.pages;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String appUid; 
            private String boardId; 
            private java.util.List < Configs> configs; 
            private Long createTimestamp; 
            private Long eventTimestamp; 
            private java.util.List < Pages> pages; 
            private Long updateTimestamp; 

            /**
             * AppUid.
             */
            public Builder appUid(String appUid) {
                this.appUid = appUid;
                return this;
            }

            /**
             * BoardId.
             */
            public Builder boardId(String boardId) {
                this.boardId = boardId;
                return this;
            }

            /**
             * Configs.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * EventTimestamp.
             */
            public Builder eventTimestamp(Long eventTimestamp) {
                this.eventTimestamp = eventTimestamp;
                return this;
            }

            /**
             * Pages.
             */
            public Builder pages(java.util.List < Pages> pages) {
                this.pages = pages;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Board build() {
                return new Board(this);
            } 

        } 

    }
    public static class Snapshot extends TeaModel {
        @NameInMap("Board")
        private Board board;

        private Snapshot(Builder builder) {
            this.board = builder.board;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return board
         */
        public Board getBoard() {
            return this.board;
        }

        public static final class Builder {
            private Board board; 

            /**
             * Board.
             */
            public Builder board(Board board) {
                this.board = board;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
}
