// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryActivityItemsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryActivityItemsResponseBody</p>
 */
public class QueryActivityItemsResponseBody extends TeaModel {
    @NameInMap("Module")
    private Module module;

    private QueryActivityItemsResponseBody(Builder builder) {
        this.module = builder.module;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryActivityItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    public static final class Builder {
        private Module module; 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        public QueryActivityItemsResponseBody build() {
            return new QueryActivityItemsResponseBody(this);
        } 

    } 

    public static class SubFloor extends TeaModel {
        @NameInMap("Icon")
        private String icon;

        @NameInMap("Name")
        private String name;

        @NameInMap("Title")
        private String title;

        @NameInMap("Value")
        private String value;

        private SubFloor(Builder builder) {
            this.icon = builder.icon;
            this.name = builder.name;
            this.title = builder.title;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubFloor create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String icon; 
            private String name; 
            private String title; 
            private String value; 

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SubFloor build() {
                return new SubFloor(this);
            } 

        } 

    }
    public static class SubTitles extends TeaModel {
        @NameInMap("subFloor")
        private java.util.List < SubFloor> subFloor;

        private SubTitles(Builder builder) {
            this.subFloor = builder.subFloor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTitles create() {
            return builder().build();
        }

        /**
         * @return subFloor
         */
        public java.util.List < SubFloor> getSubFloor() {
            return this.subFloor;
        }

        public static final class Builder {
            private java.util.List < SubFloor> subFloor; 

            /**
             * subFloor.
             */
            public Builder subFloor(java.util.List < SubFloor> subFloor) {
                this.subFloor = subFloor;
                return this;
            }

            public SubTitles build() {
                return new SubTitles(this);
            } 

        } 

    }
    public static class Floor extends TeaModel {
        @NameInMap("Icon")
        private String icon;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Name")
        private String name;

        @NameInMap("SubTitles")
        private SubTitles subTitles;

        @NameInMap("Title")
        private String title;

        private Floor(Builder builder) {
            this.icon = builder.icon;
            this.index = builder.index;
            this.name = builder.name;
            this.subTitles = builder.subTitles;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Floor create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subTitles
         */
        public SubTitles getSubTitles() {
            return this.subTitles;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String icon; 
            private Integer index; 
            private String name; 
            private SubTitles subTitles; 
            private String title; 

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SubTitles.
             */
            public Builder subTitles(SubTitles subTitles) {
                this.subTitles = subTitles;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Floor build() {
                return new Floor(this);
            } 

        } 

    }
    public static class FloorDisplayInfos extends TeaModel {
        @NameInMap("floor")
        private java.util.List < Floor> floor;

        private FloorDisplayInfos(Builder builder) {
            this.floor = builder.floor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FloorDisplayInfos create() {
            return builder().build();
        }

        /**
         * @return floor
         */
        public java.util.List < Floor> getFloor() {
            return this.floor;
        }

        public static final class Builder {
            private java.util.List < Floor> floor; 

            /**
             * floor.
             */
            public Builder floor(java.util.List < Floor> floor) {
                this.floor = floor;
                return this;
            }

            public FloorDisplayInfos build() {
                return new FloorDisplayInfos(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("FloorDisplayInfos")
        private FloorDisplayInfos floorDisplayInfos;

        @NameInMap("FloorItems")
        private String floorItems;

        private Module(Builder builder) {
            this.data = builder.data;
            this.floorDisplayInfos = builder.floorDisplayInfos;
            this.floorItems = builder.floorItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return floorDisplayInfos
         */
        public FloorDisplayInfos getFloorDisplayInfos() {
            return this.floorDisplayInfos;
        }

        /**
         * @return floorItems
         */
        public String getFloorItems() {
            return this.floorItems;
        }

        public static final class Builder {
            private String data; 
            private FloorDisplayInfos floorDisplayInfos; 
            private String floorItems; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * FloorDisplayInfos.
             */
            public Builder floorDisplayInfos(FloorDisplayInfos floorDisplayInfos) {
                this.floorDisplayInfos = floorDisplayInfos;
                return this;
            }

            /**
             * FloorItems.
             */
            public Builder floorItems(String floorItems) {
                this.floorItems = floorItems;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
